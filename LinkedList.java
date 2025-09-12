public class LinkedList {
    public static class Node{
      int data;
      Node next;

      public Node(int data){
         this.data=data;
         this.next=null;

      }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1: create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;

        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
    
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(45);
        ll.addLast(56);
        ll.print();
        
    }
}
