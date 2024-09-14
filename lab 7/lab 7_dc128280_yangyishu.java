class fibonacci{
    public static int Binaryfi(int n){
        if (n<=1){
            return n;
        }
        else{
            return Binaryfi(n-1)+Binaryfi(n-2);
        }
    }
    public static int Linearfi(int m,int l,int n){
        if(n==0)
            return m;
        if(n==1)
            return l;
        if(n==2)
            return m+l;
        else{
            return Linearfi(l,m+l,n-1);
        }
    }

public static void main(String[] args)
{
    System.out.println("Binary recursion method with nth nonnegative:");
    for (int i=0;i<21;i++){
    System.out.println(Binaryfi(i));}
    System.out.println("Linear recursion method with nth nonnegative:");
    for (int i=0;i<21;i++){
        System.out.println(Linearfi(0,1,i));}
}
}