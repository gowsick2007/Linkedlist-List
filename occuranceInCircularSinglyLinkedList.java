import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class occuranceInCircularSinglyLinkedList {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String[]a=obj.nextLine().split(" ");
    int target=Integer.parseInt(a[0]);
    Node head=null;
    Node temp=null;
    for(int i=1;i<a.length;i++){
        Node newnode=new Node(Integer.parseInt(a[i]));
        if(head==null){
            head=newnode;
            temp=newnode;
        }else{
            temp.next=newnode;
            temp=newnode;
        }
    }
temp.next=head;
    
int count=0;
if(head!=null){
    Node cur=head;
 do{
    if(cur.data==target){
    count++;
    }cur=cur.next;
 } while(cur!=head);
}
System.out.print(count);
    }
}
