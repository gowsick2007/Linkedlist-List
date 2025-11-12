import java.util.*;

class Node {
    int data;
    Node prev, next;
    Node(int data){
         this.data = data;
         }
}

class DoublyLinkedList {
    Node head = null;

    // Method to insert data into the doubly linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Traverse to the end and insert the new node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Method to delete a node at a specific position
    public void deleteAtPosition(int pos) {
        if (head == null || pos < 0) return;

        // Case 1: If the node to delete is the head
        if (pos == 0) {
            head = head.next;
            if (head != null)
             head.prev = null;
            return;
        }

        // Traverse to the node at the given position
        Node temp = head;
        int index = 0;
        while (temp != null && index < pos) {
            temp = temp.next;
            index++;
        }

        // If the position is out of range
        if (temp == null) return;

        // Unlink the node from the list
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    // Method to display the entire doubly linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
    }
}

public class DeleteAtposition_double{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        // Parse the position to delete
        int pos = Integer.parseInt(input[0]);

        // Create an instance of DoublyLinkedList
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert all values except the first one (position to delete)
        for (int i = 1; i < input.length; i++) {
            dll.insert(Integer.parseInt(input[i]));
        }

        // Delete the node at the specified position
        dll.deleteAtPosition(pos);

        // Display the updated list
        dll.display();
    }
}

