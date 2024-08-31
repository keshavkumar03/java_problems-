package Java_arrays;
import java.util.*;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
       System.out.println("enter the array Nos: ");
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=scan.nextInt();

        
        }
        for(int i=0;i<10;i++){
           
         sum+=arr[i];
        
        }

        System.out.println(sum);
    }
}
