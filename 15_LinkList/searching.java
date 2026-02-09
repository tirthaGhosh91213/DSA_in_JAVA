public class searching {
   public static class Node{
    int data ;
    Node next;
    public Node(int data ){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int  size;
  public  void addFirst(int data ){
    Node newNode=new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;

  }
    public void addLast(int data){
    Node newNode= new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;

    }
    tail.next=newNode;
    tail=newNode;
  }
  public void print(){
    if(head==null){
      System.out.println("LinkedList is empty");
      return;
    }
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"-> ");
      temp=temp.next;
    }
    System.out.println(" null");
  }
  public static void main(String[] args) {
      LinkedList ll=new LinkedList();
    
    ll.addFirst(1);

    ll.addFirst(2);
 
    ll.addLast(3);
  
    ll.addLast(4);
    ll.print();
  }
}
