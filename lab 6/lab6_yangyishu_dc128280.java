//rotate a Doubly linked list
class lab6 {
//create a node 
    static class Node
    {
        char data;
        Node previous;
        Node next;
    }
    static Node head = null;
//function to rorate
    static void rot( int n)
    {
        if (n == 0)
            return;
        Node current = head;
        int j = 1;
        while (j < n && current != null)
        {
            current = current.next;
            j++;
        }
        if (current == null)
            return;
        Node   found = current;
        while (current.next != null)
            current = current.next;
        current.next = head;
        (head).previous = current;
        head = found.next;
        (head).previous = null;
        found.next = null;
    }
    static void sett(char new_data)
    {
        Node news = new Node();
     news.data = new_data;
     news.previous = null;
     news.next = (head);
        if ((head) != null)
            (head).previous = news;
    head = news;
    }
     
    /*print doublely linked list */
    static void print(Node node)
    {
        while (node != null && node.next != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if(node != null)
        System.out.print(node.data);
    }
     
//run
    public static void main(String[] args)
    {
        sett( 'e');
        sett( 'd');
        sett('c');
        sett('b');
        sett( 'a');
        System.out.println("Original linked list ");
        print(head);
        rot(2);
        System.out.println();
        System.out.println("Final Linked list ");
        print(head);
    }
    }