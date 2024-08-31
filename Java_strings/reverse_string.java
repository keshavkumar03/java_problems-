package Java_strings;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        System.out.println("revesed Sting: "+ new StringBuilder(str).reverse().toString());
    }
}
