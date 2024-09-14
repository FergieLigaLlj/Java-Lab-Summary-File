import java.lang.*;
import java.util.*;
public interface Stack<E>{
    int size();
    boolean isEmpty();
    E top();
    void push(E element);
    E pop();
    static boolean isMatched(String expression){return false;}
class LinkedStack<E> implements Stack<E>{
    private LinkedList<E> list = new LinkedList<>();
    public LinkedStack(){}
    public int size(){return list.size();}
    public boolean isEmpty(){return list.isEmpty();}
    public void push(E element){list.addFirst(element);}
    public E top(){return list.getFirst();}
    public E pop(){return list.removeFirst();}
    public static boolean isMatched(String expression) {
        final String opening = "([";
        final String closing = ")]";
        LinkedStack<Character>buffer =new LinkedStack<>();
        for (char c:expression.toCharArray()){
            if(opening.indexOf(c)!=-1)
                buffer.push(c);
            else if(closing.indexOf(c)!=-1){
                if (buffer.isEmpty())
                    return false;
                if(closing.indexOf(c)!=opening.indexOf(buffer.pop()))
                    return false;
            }
        }
        return buffer.isEmpty();
    }
}
public static void main(String[] args){
    System.out.println("input: [(])");
    System.out.println(isMatched("[(])"));
}
}
