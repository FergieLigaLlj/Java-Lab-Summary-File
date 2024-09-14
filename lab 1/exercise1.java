import java.util.*;
public class E1{
 public static void main(String[] args) {
   while(true){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter your value:");
   int a = in.nextInt();
   System.out.println(isPower(a));
   }
 } 

 public static boolean isPower(int n){
  if(n<=0){
   return false;
  } 
  while(n > 1){
   if(n % 2 != 0){
    return false;
   }
   n = n / 2;
  }
  return true;
 }
}