import java.io.*;
class ReadFile{
    public static int isLowerCase(int chr){
        if(chr>=97 && chr<=122)
            return 1;
        else
            return 0;
    }
    public static int isUpperCase(int chr){
        if(chr>=65 && chr<=90)
            return 1;
        else
            return 0;
        }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int j;
        System.out.println("Enter a file of your choice: ");
        String path = br.readLine();
        int[] F_Upper=new int[26];
        int[] F_Lower=new int[26];
        for(i=0;i<26;i++){
                F_Upper[i]=0;
                F_Lower[i]=0;
            }
        FileReader reader = new FileReader(path);
        int c;
        while((c=reader.read())!=-1){
                if (isLowerCase(c)==1){
                    F_Lower[c-97]+=1;
                }
                if(isUpperCase(c)==1){
                    F_Upper[c-65]+=1;
                }
            }
        for (j=0;j<26;j++){
            System.out.println(" The frequency of "+(char)(j+97)+" is "+F_Lower[j]);
            System.out.println(" The frequency of "+(char)(j+65)+" is "+F_Upper[j]);
        }
    }
}