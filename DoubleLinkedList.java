import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
       this. data=data;
        this.prev=null;
        this.next=null; 
    }
}
class single{
    Node head;
public void input(){
    Scanner obj=new Scanner(System.in);
    String[] a=obj.nextLine().split(" ");
    for(String i:a){
        insert(Integer.parseInt(i));
    }
}
public void insert(int val){
    Node newnode=new Node(val);
    
    Node tail=null;
    if(head==null){
        head=newnode;
    }else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        }
}
public void display(){
   Node temp=head;
    while(temp!=null){
        System.out.print(temp.data);
        if(temp.next!=null){
            System.out.print(" <-> ");
        }
temp=temp.next;
    }
}
}
public class DoubleLinkedList {
    public static void main(String[] args) {
    single s=new single();
    s.input();
    s.display();
    }
}

