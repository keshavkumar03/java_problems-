package Java_strings;
import java.util.*;
public class string_count {
    public static void main(String[] args) {
        int wordcount =1; 
        int  charcount =0;

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for(char x:str.toCharArray()){
          charcount++;
          if(x==' '){
            wordcount++;
          }
        }
System.out.println("character count:"+charcount);
System.out.println("word count:"+wordcount);
    }
}
