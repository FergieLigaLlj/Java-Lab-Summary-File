import java.util.*;
import java.lang.*;
public class dc128280{
    public static double PuzzleSolve(int k,char[]S ,char[] U){
        for (char element:U){
            int i;
            int j;
            int l;
            U=U.remove(element);
            S=S.add(element);
            if (k==1){
                if(S[0]=="a")
                    i=7;
                if(S[0]=="b")
                    j=7;
                if(S[0]=="c")
                    l=7;
                if(S[1]=="a")
                    i=8;
                if(S[1]=="b")
                    j=8;
                if(S[1]=="c")
                    l=8;
                if(U[0]=="a")
                    i=9;
                if(U[0]=="b")
                    j=9;
                if(U[0]=="c")
                    l=9;
                int p=l*100+j*21+i*1;
                int q=100*i+10*j+l*1;
                if(p==q){
                    return " a="+i+" b="+j+" c="+l;
                }
            }
            else{
                return PuzzleSolve(k-1,S,U);
            }
            U=U.add(element);
            S=S.remove(element);
        }
}
    public static void main(String[] args){
        char SS[]=new char[3];
        char UU[]=new char[]{"a","b","c"};
        System.out.println(PuzzleSolve(3,SS,UU));
}}