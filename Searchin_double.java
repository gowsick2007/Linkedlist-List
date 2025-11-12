import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Searchin_double{
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      String[]a=obj.nextLine().split(" ");
      int target=Integer.parseInt(a[0]);
      Node head=null;
      for(int i=1;i<a.length;i++){
        Node newnode=new Node(Integer.parseInt(a[i]));
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
      Node current=head;
      boolean found=false;
      while(current!=null){
        if(current.data==target){
            found=true;
            break;
        }
        current=current.next;
      }
      if(found){
      System.out.print("Found");
        }else{
            System.out.print("Not Found");
        }
    }
}
