package java_linked_list;

public class Intro {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.insertFirst(3);
      list.insertFirst(2);
      list.insertFirst(4);
      list.insertFirst(12);
      list.insertFirst(8);
      list.insertLast(100);
      list.insert(100,3);
      list.deleteFirst();
      list.display();
    }
}
