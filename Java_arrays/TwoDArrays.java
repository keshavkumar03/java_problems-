package Java_arrays;
import java.util.*;

public class  TwoDArrays {
   
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int arr[][]={

            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int array[][]=new int[2][3];

        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[row].length;col++){
                array[row][col]=scan.nextInt();
            }
            
}
//method 1
        for(int row=0;row<array.length;row++){
          for(int col=0;col<array[row].length;col++){
             System.out.println(array[row][col]+" ");
    }
}

for(int row=0;row<array.length;row++){
    System.out.println(Arrays.toString(array[row]));
}


for (int[] is : array) {
    System.out.println(Arrays.toString(is));
}

}}

