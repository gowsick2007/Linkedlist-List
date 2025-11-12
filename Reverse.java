import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       String[]a=obj.nextLine().split(" ");
       Node head=null;
       Node temp=null;
       for(int i=0;i<a.length;i++){
        Node newnode=new Node(Integer.parseInt(a[i]));
        if(head==null){
            head=newnode;
            temp=head;
        }else{
            temp.next=newnode;
            temp=newnode;
        }
       }
Node prev=null;
Node current=head;
while(current!=null){
   Node next=current.next;
    current.next=prev;
    //current.prev=next;
    prev=current;
    current=next;
}
head=prev;
temp=head;
while(temp!=null){
    System.out.print(temp.data);
    if(temp.next!=null){
        System.out.print(" -> ");
    }
    temp=temp.next;
}


    }
}
