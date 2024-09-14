import java.lang.*;
class CircularlyLinkedList<E> {
    //the CircularlyLinkedList
    private Node<E> tail = null; //we store tail
    private int size = 0; 
    public CircularlyLinkedList( ) { } //initial empty list

public void addFirst(E e) { //add elementto the front
    if (size == 0) {
          tail = new Node<>(e, null);
          tail.setNext(tail); 
       }
   else { 
        Node<E> newest = new Node<>(e, tail.getNext( ));
        tail.setNext(newest);
     } 
   size++;
 }
 public void addLast(E e) { //add elementto the end
    addFirst(e); //insert new element at front of list
    tail = tail.getNext( ); //-new element becomes the tail
}
public static void main(String[] args) {
	CircularlyLinkedList<Integer> list= new 	CircularlyLinkedList<Integer>();
 	list.addLast(0);
 	list.addLast(1);
 	list.addLast(2);
    System.out.println("Original List");
    list.display();
    CircularlyLinkedList<Integer> list2= new 	CircularlyLinkedList<Integer>();
 	list2.addFirst(0);
 	list2.addFirst(1);
 	list2.addFirst(2);
    System.out.println("Reverse List");
    list2.display();
    }
 public void display(){
    Node<E> n = tail;
    while(n != null){
      System.out.print(n.element+"\n");
      n = n.next;
      if(tail == n.next){
        break;
      }
    }
 }
private static class Node<E>{ 
    private E element; 
    private Node<E> next; 
    public Node(E e, Node<E> n){ 
        element = e;
        next = n;
      } 
    public Node<E> getNext( ) { return next; }
    public void setNext(Node<E> n) { next = n; }
    }
}