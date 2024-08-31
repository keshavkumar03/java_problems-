package java_linked_list;

public class LinkedList {
 
  private Node head;
  private Node tail;
  private int size;

  public LinkedList(){
    this.size = 0;
  }
//insertions

//at head
  public void insertFirst(int value){
    Node node = new Node(value);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }
    size += 1;
  }

  //at specfic index
public void insert(int value,int index){
if(index==0){
  insertFirst(value);
  return;
}
if(index==size){
  insertLast(value);
  return;
}
Node temp=head;
for(int i=1;i<index;i++){
  temp=temp.next;
}
Node node=new Node(value,temp.next);//temp.next is still the the next no without inserting
//removing the previous connection 
temp.next=node; 
}

  //at last
  public void insertLast(int value){
    if(tail==null){
      insertFirst(value);
      return;}     Node node=new Node(value);
    tail.next=node;
    tail=node;
    size++;
  }
//deletions

//delete at first
public int deleteFirst(){
  int val=head.value;
  head=head.next;
  if(head==null){
    tail=null;}
  return val;
}


//deltions at last

public void deleteLast(){
  if(size==1){
    deleteFirst();
  }
  Node second_last= get(size-2);
}

  public void display(){
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + "->");
      temp = temp.next;
    }
    System.out.println("end");
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
