import java.lang.Math;
/** total definition of area using abstract */
abstract class Total
{abstract void area();
 double area;
}
/** extension from calculation of rect */
class Rect extends Total{
 double w=345.67544,h=1214234.54367;
 void area()
 {
  area = w*h;
  System.out.println("area of Rectangle -->"+area);
 }
}
/** extension from calculation of cir */
class Cir extends Total{
 double r=5.432;
 void area()
 {
  area = Math.PI * r * r;
  System.out.println("area of Circle -->"+area);
 }
}
/** final calculation */
class Area
{
 public static void main(String [] args)
 {
  Rect r =new Rect();
  Cir c =new Cir();
  
  r.area();
  c.area();
 }
}