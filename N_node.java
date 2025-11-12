import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class N_node{
    public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
String[]a=obj.nextLine().split(" ");
int num=Integer.parseInt(a[0]);
Node head=null;
Node temp=null;
for(int i=1;i<a.length;i++){
    Node newnode=new Node(Integer.parseInt(a[i]));
   if(head==null){
    head=newnode;
    temp=head;
   } else{
    temp.next=newnode;
    temp=newnode;
   }
}
Node first=head;
Node second=head;
for(int i=0;i<num;i++){
    if(first==null){
        System.out.print("Position out of range");
        return;
    }
    first=first.next;
}
while(first!=null){
    first=first.next;
    second=second.next;
}

System.out.print(second.data);

    }
}
