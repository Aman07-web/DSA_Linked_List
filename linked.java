class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linked {
    Node head;
    public  void add(int data){
        Node newNode=new Node(data);
       if(head == null){
        head=newNode;
        return;
       }
       Node curr=head;
       while(curr.next != null){
         curr=curr.next;
       }
       curr.next=newNode;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
    linked ll=new linked();
    ll.add(12);
    ll.add(34);
    ll.add(56);
    ll.display();
    
}    
}
