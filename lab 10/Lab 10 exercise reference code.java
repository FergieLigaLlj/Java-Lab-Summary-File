public  class InOrderTraversal{
    public static void main(String[] args){
      BinaryTree T1 =new BinaryTree();
      T1.element='+';
      BinaryTree T2 =new BinaryTree();
      T2.element='*';
      BinaryTree T3 =new BinaryTree();
      T3.element='*';
      BinaryTree T4 =new BinaryTree();
      T4.element='2';
      BinaryTree T5 =new BinaryTree();
      T5.element='-';
      BinaryTree T6 =new BinaryTree();
      T6.element='3';
      BinaryTree T7 =new BinaryTree();
      T7.element='b';
      BinaryTree T8 =new BinaryTree();
      T8.element='a';
      BinaryTree T9 =new BinaryTree();
      T9.element='1';
      
      
      T5.left=T8;
      T5.right=T9;
      T2.left=T4;
      T2.right=T5;
      T3.left=T6;
      T3.right=T7;
      T1.left=T2;
      T1.right=T3;  
      T1.inOrder();
    }
    
    
    public static class BinaryTree{
      BinaryTree left;
      BinaryTree right;
      char element;
      public BinaryTree(){
       this.left=null;
       this.right=null;
       this.element='0';
      }
      public void inOrder(){
        if(this.left!=null){
          System.out.print('(');
          this.left.inOrder();
        }
        System.out.print(this.element);
        if(this.right!=null){
          this.right.inOrder();
          System.out.print(')');
        }
      }
    }
  }