import java.io.*;
import java.util.*;
public class frequencies{

    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a file of your choice: ");
        String path= input.nextLine();
        File file= new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader br= new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while((line=br.readLine())!=null){
            stringBuilder=stringBuilder.append(line);
        }

        String string=stringBuilder.toString();
      
        // closing bufferreader object

        br.close();

        int[] lettercount=new int[26];
        for(int i=0;i<26;i++){
            lettercount[i]=0;
        }


       char[] array = string.toCharArray(); 


        for( char s:array){
            int converted= (int)s;
            if(converted>=97&& converted<=122){
                converted= converted-97;
            }else if (converted>=65&& converted<=90){
                converted=converted-65;
            }
            if(converted>=0&& converted <=25){
                lettercount[converted]+=1;
            }
        }

        for(int i=0; i<26; i++){
            char convertback= (char) (i+97);
            System.out.println(convertback+"-"+lettercount[i]);
        }
    



        
        
    }
}
