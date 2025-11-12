import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeletecircularsinglyLinkedList{
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
public void delete(){
    if(head==null){
        return;
    }
    if(head==tail){
        head=tail=null;
    }
    Node temp=head;
    while(temp.next!=tail){
        temp=temp.next;
    }
    tail=temp;
    tail.next=head;
}
public void display(){
    if(head==null){
        return;
    }
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
     Scanner obj=new Scanner(System.in);
     Main m=new Main();
     String[]a=obj.nextLine().split(" ");
     for(int i=0;i<a.length;i++){
       m.insert(Integer.parseInt(a[i]));
     }  
     m.delete();
     m.display();
    }
}

