import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class PowerofTwo{
  static boolean IfPowerOfTwo(int a){
    if (a==0)
      return false;
    while(a!=1){
      if (a%2!=0)
        return false;
      a=a/2;
       
    }
    return true;
  }

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
             //IfPowerOfTwo(n);
             System.out.println(IfPowerOfTwo(n));
             if (IfPowerOfTwo(n)==false)
                break;
             
           }
}
}



