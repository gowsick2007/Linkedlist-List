import java.util.*;


class Node {
    int data;
    Node next, child;
    Node(int d) { data = d; }
}

public class Flatten {

    
    static class Frame {
        Node head, tail;
        Node parent; 
        Frame(Node parent) { this.parent = parent; }
        void append(Node n) {
            if (head == null) head = tail = n;
            else { tail.next = n; tail = n; }
        }
    }

    static Node parseMultilevel(String line) {
        String[] t = line.trim().split("\\s+");
        Deque<Frame> st = new ArrayDeque<>();
        st.push(new Frame(null)); 

        for (String tok : t) {
            if (tok.equals("(")) {
                Node parent = st.peek().tail;
                st.push(new Frame(parent));
            } else if (tok.equals(")")) {
                Frame childFrame = st.pop();
                if (st.isEmpty())
                    throw new IllegalArgumentException("Unbalanced parentheses");
                if (childFrame.parent != null) {
                    childFrame.parent.child = childFrame.head;
                } 
            } else {
                int val = Integer.parseInt(tok);
                st.peek().append(new Node(val));
            }
        }
        if (st.size() != 1) throw new IllegalArgumentException("Unbalanced parentheses");
        return st.peek().head;
    }
    static Node flatten(Node head) {
        if (head == null) return null;
        Node dummy = new Node(0), tail = dummy;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            while (curr != null) {
                tail.next = curr;
                tail = curr;

                
                if (curr.next != null) stack.push(curr.next);

                
                Node nxt = curr.child != null ? curr.child : null;
                curr.child = null; 
                curr = nxt;
                if (curr == null && !stack.isEmpty()) {
                    curr = stack.pop();
                }
            }
        }
        
        tail.next = null;
        return dummy.next;
    }

    static void display(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.data);
            if (p.next != null) System.out.print(" -> ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Node head = parseMultilevel(line);
        head = flatten(head);
        display(head);
    }
}
