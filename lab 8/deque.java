import java.util.*;
class lab8
{
  static class Node
  {
    int data;
    Node prev, next;
    static Node getnode(int data)
    {
      Node newNode = new Node();
      newNode.data = data;
      newNode.prev = newNode.next = null;
      return newNode;
    }
  };
  static class Deque {
    Node front;
    Node rear;
    int Size;
 
    Deque()
    {
      front = rear = null;
      Size = 0;
    }
    boolean isEmpty() { return (front == null); }
    int size() { return Size; }
    void insertFront(int data)
    {
      Node newNode = Node.getnode(data);
      if (newNode == null)
        System.out.print("OverFlow\n");
      else {
        if (front == null)
          rear = front = newNode;
        else {
          newNode.next = front;
          front.prev = newNode;
          front = newNode;
        }
        Size++;
      }
    }
    void insertRear(int data)
    {
      Node newNode = Node.getnode(data);
      if (newNode == null)
        System.out.print("OverFlow\n");
      else {
        if (rear == null)
          front = rear = newNode;
        else {
          newNode.prev = rear;
          rear.next = newNode;
          rear = newNode;
        }
        Size++;
      }
    }
    void deleteFront()
    {
      if (isEmpty())
        System.out.print("UnderFlow\n");
      else {
        Node temp = front;
        front = front.next;
        if (front == null)
          rear = null;
        else
          front.prev = null;
        Size--;
      }
    }
    void deleteRear()
    {
      if (isEmpty())
        System.out.print("UnderFlow\n");
      else {
        Node temp = rear;
        rear = rear.prev;
        if (rear == null)
          front = null;
        else
          rear.next = null;
        Size--;
      }
    }
    int getFront()
    {
      if (isEmpty())
        return -1;
      return front.data;
    }
    int getRear()
    {
      if (isEmpty())
        return -1;
      return rear.data;
    }
    void erase()
    {
      rear = null;
      while (front != null) {
        Node temp = front;
        front = front.next;
      }
      Size = 0;
    }
  }
}