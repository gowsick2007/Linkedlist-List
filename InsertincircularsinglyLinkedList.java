import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertincircularsinglyLinkedList{
    Node head=null;
    Node tail=null;
public void insert(int val){
    Node newnode=new Node(val);
    if(head==null){
   head=newnode;
   tail=newnode;
    }else{
      tail.next=newnode;
      tail=newnode;
    }
    tail.next=head;
}
public void display(){
    Node temp=head;
    do{
        System.out.print(temp.data);
        temp=temp.next;
        if(temp!=head){
            System.out.print(" -> ");
        }
    }while(temp!=head);
}
    public static void main(String[] args) {
Main m=new Main();
Scanner obj=new Scanner(System.in);
String[]a=obj.nextLine().split(" ");
for(int i=0;i<a.length;i++){
    m.insert(Integer.parseInt(a[i]));
}
m.display();
    }
}

