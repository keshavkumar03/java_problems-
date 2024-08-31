// Java program to check if a given string is a palindrome or not
import java.util.*;

public class is_palindrome {


    //other way
   public static boolean isPalindroms(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(reversed); // Ignore case when comparing
   }
    public static void main(String[] args) {
        boolean is_palin = true;

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int n = str.length(); // Declare n before the loop

        for (int i = 0; i < n; i++) { // Use < instead of <=
            char front = str.charAt(i);
            char back = str.charAt(n - i - 1);
            if (front != back) {
                is_palin = false;
            }
        }

        System.out.println(is_palin);//1 st way
        System.out.println(isPalindroms(str));//2nd way

    }
}
