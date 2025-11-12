import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    Node head, tail;
    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    public void insertAtPosition(int pos, int data) {
        Node newnode = new Node(data);
        if (pos == 0) {
            newnode.next = head;
            if (head != null) {
                head.prev = newnode;
            }
            head = newnode;
            if (tail == null) { 
                tail = newnode;
            }
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp == tail) {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        } 
        else {
            newnode.next = temp.next;
            temp.next.prev = newnode;
            newnode.prev = temp;
            temp.next = newnode;
        }
    }
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
    }
}

public class DoubleLinkedListInsertAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");

        int pos = Integer.parseInt(a[0]);
        int value = Integer.parseInt(a[1]);

        DoublyLinkedList list = new DoublyLinkedList();

        for (int i = 2; i < a.length; i++) {
            list.insert(Integer.parseInt(a[i]));
        }

        list.insertAtPosition(pos, value);
        list.displayList();
    }
}
