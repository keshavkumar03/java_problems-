package Java_arrays;
import java.util.*;

public class largest_no {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,65};
        Arrays.sort(arr);
        int n =arr.length;

        System.out.println("smallest two nos are: "+ arr[0]+","+arr[1]);
        System.out.println("largest two nos are: "+ arr[n-2]+","+arr[n-1]);
    }
}
