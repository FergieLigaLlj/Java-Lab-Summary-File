import java.lang.*;
class A{
public int x = 5;
public int Get(){
        return x;
    }
public void Set(int y){
        x=y;
    }
}
class B extends A{
public int x=3;
public int Get(){
        return x;
    }
public void Set(int y){
        x=y;
    }
public int SuperGet(){
        return super.x;
    }
public void SuperSet(int y){
        super.x=y;
    }
}

class C extends B{
int x=1;
public int Get(){
        return x;
    }
public void Set(int y){
        x=y;
    }
public int SuperGet(){
        return super.x;
    }
public void SuperSet(int y){
        super.x = y;
    }
public int SuperSuperGet(){
        return super.SuperGet();
    }
public void SuperSuperSet(int y){
        super.SuperSet(y);
    }
    public static void main(String[] args){
        C c=new C();
        System.out.println("C's is"+c.Get());
        System.out.println("B's is"+c.SuperGet());
        System.out.println("A's is"+c.SuperSuperGet());
        c.SuperSuperSet(10);
        System.out.println("C's is"+c.Get());
        System.out.println("B's is"+c.SuperGet());
        System.out.println("A's is"+c.SuperSuperGet());
    }
}