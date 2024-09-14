package positionallist;

public class PositionListTest {

    public static void main(String[] args) {
        LinkedPositionalList<Integer> list = new LinkedPositionalList<>();

        list.addLast(5);
        list.addLast(2);
        list.addLast(4);
        list.addLast(2);
        list.addLast(4);
        // list: 5 2 4 2 4
        System.out.println("Size of the list: " + list.size());
        // return size of list
        int a=2;
        // find index of first integer (2)
        System.out.println("The index of first element: "+a+" is");
        // print out this index it,it should be 1
        list.findPosition(a);

    }
}
