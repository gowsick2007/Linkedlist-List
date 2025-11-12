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
public class N_nodein_double {
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
        temp=head;
    }else{
        temp.next=newnode;
        newnode.prev=temp;
        temp=temp.next;
    }
    }
int length=0;
temp=head;
while(temp!=null){
    length++;
    temp=temp.next;
}
if(pos>length){
    System.out.print("Position out of range");
    return;
}
int targetindex=length-pos;
Node cur=head;
for(int i=0;i<targetindex;i++){
 cur=cur.next;
}
System.out.print(cur.data);

    }
}

