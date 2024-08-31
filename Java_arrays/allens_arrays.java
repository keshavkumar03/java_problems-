 import java.util.Arrays;

public class allens_arrays {
    public static int allensValue(int input1, int[] input2, int[] input3) {
        // Sort the arrays
        Arrays.sort(input2);
        Arrays.sort(input3);
        
        // Calculate the differences
        int[] differences = new int[input3.length];
        for (int i = 0; i < input3.length; i++) {
            differences[i] = input3[i] - input2[i];
        }
        
        // Find the minimum difference
        int minDifference = differences[0];
        for (int i = 1; i < differences.length; i++) {
            if (differences[i] < minDifference) {
                minDifference = differences[i];
            }
        }
        
        return minDifference;
    }

    public static void main(String[] args) {
        int input1 = 3;
        int[] input2 = {2, 1, 3};
        int[] input3 = {2};
        
        System.out.println(allensValue(input1, input2, input3));  // Output: 1
    }
}
 