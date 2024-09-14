import java.io.*;
class Q2
{
  public static void main(String args[]) throws IOException 
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
           String str = null; 
           while(true)
           {
             System.out.println("Enter your value:"); 
             str = br.readLine(); 
             System.out.println("your value is :"+str); 
             int n = Integer.parseInt(str);
             if(n==0)
               break;
             add(n);
           }
  }
  public static void add(int m)
  {
    int sum=0;
    for(int i = 0; i<=m;i++)
    {
     sum+=i;
    }
     System.out.println("Sum = "+ sum);//Output
  }
}