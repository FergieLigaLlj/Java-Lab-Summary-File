import java.lang.*;
/**general case of interface involve area */
interface CArea{
    double pi = 3.141592653;
    double calc(double x,double y);
}
/*class of circle area */
class rect implements CArea{
    public double calc(double x,double y){
        return x*y;
    }
}
/*class of rectangle area */
class circle implements CArea{
    public double calc(double x,double y){
        return pi*x*x;
    }
}
class test{
    public static void main(String arg[]){
        circle c = new circle();
        rect r = new rect();
        System.out.println("Area of the circle is "+c.calc(10, 10));
        System.out.println("Area of the rectangle is "+r.calc(20, 15));
    }
}