public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        // Swap elements to reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();  // to print a new line
    }
}
