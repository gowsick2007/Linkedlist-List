import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SearchincircularsinglyLinkedList {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String[]a=obj.nextLine().split(" ");
    int target=Integer.parseInt(a[0]);
     Node head=null;
    Node tail=null;
    for(int i=1;i<a.length;i++){
    Node newnode=new Node(Integer.parseInt(a[i]));
    if(head==null){
        head=newnode;
        tail=newnode;
    }else{
        tail.next=newnode;
        tail=newnode;
    }
    }
    tail.next=head;
    boolean found=false;
    Node temp=head;
   do{
    if(temp.data==target){
        found=true;
        break;
    }temp=temp.next;
   }while(temp!=head);
    if(found){
        System.out.print("Found");
    }else{
        System.out.print("Not Found");
    }
    
    }
}

