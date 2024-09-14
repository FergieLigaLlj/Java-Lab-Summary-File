package positionallist;

public class LinkedPositionalList<E> implements PositionalList<E> {

    private static class Node<E> implements Position<E>{

        private E element;

        private Node<E> prev;

        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n){
            this.element = e;
            this.prev = p;
            this.next = n;
        }

        @Override
        public E getElement() throws IllegalStateException {
            if (next == null)
                throw new IllegalArgumentException("Position no longer valid");
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList(){
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
    }

    private Node<E> validate(Position<E> p) throws IllegalArgumentException{
        if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
        Node<E> node = (Node<E>) p;

        if(node.getNext() == null)
            throw new IllegalArgumentException("p is no longer in the list");

        return node;
    }

    private Position<E> position(Node<E> node){
        if (node == header || node == trailer)
            return null;
        return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Position<E> first() {
        return position(header.getNext());
    }

    @Override
    public Position<E> last() {
        return position(trailer.getPrev());
    }

    @Override
    public Position<E> before(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getPrev());
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getNext());
    }

    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ){
        Node<E> newest = new Node<>(e, pred, succ);
        pred.setNext(newest);
        succ.setPrev(newest);
        size++;
        return position(newest);
    }

    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e, header, header.getNext());
    }

    @Override
    public Position<E> addLast(E e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E answer = p.getElement();
        node.setElement(e);
        return answer;
    }

    @Override
    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E answer = node.getElement();
        node.setElement(null);
        node.setPrev(null);
        node.setNext(null);
        return answer;
    }
    public Position<E> findPosition(E e){
        // define the beginning node to be current = header//
        Node<E> cursor = header;
        Node<E> current  = validate(cursor);
        // treat header index to be -1//
        int count = -1;
        // when the current node's next node is not trailer
        while (current.getNext()!=null){
        // if the element of current node is found to be integer e
            if(current.getElement()==e){
        // print out current index
                System.out.println(count);
        // return current node's position
                return position(current);
            }
        // index to be increased by 1
            count++;
        // current now is next node of current
            current=current.getNext();
            
        }
        // if no node's element is integer e,return position of node to be null
        return null;
    }
}
