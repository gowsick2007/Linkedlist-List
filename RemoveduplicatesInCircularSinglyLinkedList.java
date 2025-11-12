import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveduplicatesInCircularSinglyLinkedList {
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     String[]a=obj.nextLine().split(" ");
     Node head=null;
     Node tail=null;
     for(int i=0;i<a.length;i++){
        Node newnode=new Node(Integer.parseInt(a[i]));
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            tail=newnode;
        }
     }
 if (tail != null) {
 tail.next = head;
}
if (head == null || head.next == head) {
    return;
}
Node current=head;
do {
Node prev = current;
Node runner = current.next;
while (runner != head) {
if (runner.data == current.data) {
prev.next = runner.next;
runner = runner.next;
 } else {
 prev = runner;
runner = runner.next;
 }
}
 current = current.next;
        }while(current!=head);
Node temp=head;
do{
    System.out.print(temp.data);
    temp=temp.next;
    if(temp!=head){
        System.out.print(" -> ");
    }
}while(temp!=head);

    }
}/*Node cur = head;
do {
while (cur.next != head && cur.data == cur.next.data) {
cur.next = cur.next.next; // remove duplicate
}
 cur = cur.next;
} while (cur != head);
Node temp=head;*/
