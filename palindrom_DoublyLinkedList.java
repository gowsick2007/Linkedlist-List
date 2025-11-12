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
public class palindrom_DoublyLinkedList {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String[]a=obj.nextLine().split(" ");
        Node head=null;
        for(int i=0;i<a.length;i++){
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
Node tail=head;//find tail
while(tail!=null &&tail.next!=null){
    tail=tail.next;
}
Node left=head;
Node right=tail;
boolean isPalindrome=true;
while(left!=null&&right!=null){
  if(left.data!=right.data){
    isPalindrome=false;
    break;
  }
  if(left!=right&&left.next!=right){
    break;
  }
  left=left.next;
  right=right.prev;
}
System.out.print(isPalindrome);
    }
}

