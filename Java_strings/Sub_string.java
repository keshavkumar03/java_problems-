package Java_strings;
import java.util.Scanner;

public class Sub_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start index: ");
        int start = scan.nextInt();

        System.out.print("Enter end index: ");
        int end = scan.nextInt();
        
        scan.nextLine(); // Consume the newline character

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        System.out.println("Sub string: " + str.substring(start, end));

        scan.close();
    }
}
