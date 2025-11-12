import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class N_nodeincircularsingly{
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String[]a=obj.nextLine().split(" ");
    int pos=Integer.parseInt(a[0]);
    Node head=null;
    Node temp=null;
    for(int i=1;i<a.length;i++){
     Node newnode=new Node(Integer.parseInt(a[i]));
      if(head==null){
        head=newnode;
        temp=newnode;
        temp.next=head;
      }else{
        temp.next=newnode;
        temp=newnode;
        temp.next=head;
      }
 }

  int len=0;
    Node cur=head;
    do{
        len++;
        cur=cur.next;
    }while(cur!=head);
    
  if(pos>len||pos<=0){
    System.out.print("Position out of range");
    return;
  }
  
  int targetindex=len-pos;
Node current=head;
  for(int i=0;i<targetindex;i++){
    current=current.next;
  }
  System.out.print(current.data);
}
    }   
