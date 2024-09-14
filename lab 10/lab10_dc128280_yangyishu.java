import java.lang.*;
class tb{   
Node root;
//represent the nodes of tree
public static class Node
{
    String data;
    Node left, right;
    Node(String d)
    {data = d;
    left = null;
    right = null;
    }
}
private static int TowardsInteger(String s)
{
    int num = 0;
      // Generate if not negative
      // usual number
    if (s.charAt(0) != '-')
        for(int i = 0; i < s.length(); i++)
            num = num * 10 + ((int)s.charAt(i) - 48);          
    // If it is negative, calculate the +ve number
    else
    {
        for(int i = 1; i < s.length(); i++)
          num = num * 10 + ((int)(s.charAt(i)) - 48);
        num = num * -1;
    }
    return num;
}
//recursively evaluate it
public static int evaluate(Node root)
{
// Empty tree
    if (root == null)
        return 0;
 // Leaf node
    if (root.left == null && root.right == null)
        return TowardsInteger(root.data);
    //Evaluate left subtree
    int left = evaluate(root.left);
    //Evaluate right subtree
    int right = evaluate(root.right);
    //which operator to apply
    if (root.data.equals("+"))
        return left + right;
    if (root.data.equals("-"))
        return left - right;
    if (root.data.equals("*"))
        return left * right;
    return left / right;
}
public static void main(String[] args)
{  
    //sample tree 5*(-4)+(100-20)
    System.out.println("Expression:5*(-4)+(100-20):");
    System.out.println("Answer is:");
    //"60"//
    Node root = new Node("+");
    root.left = new Node("*");
    root.left.left = new Node("5");
    root.left.right = new Node("-4");
    root.right = new Node("-");
    root.right.left = new Node("100");
    root.right.right = new Node("20");
    System.out.println(evaluate(root));
    root = null;
}
}