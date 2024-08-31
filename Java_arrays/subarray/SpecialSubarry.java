public class SpecialSubarry{
    public static int special(int[] input1, int input2, int input3) {
        int x = Integer.MAX_VALUE;

        for (int i = 0; i < input2; i++) {
            int c = input1[i];
            for (int j = i; j < input2; j++) {
                c = c | input1[j];
                if (c >= input3) {
                    x = Math.min(x, j - i + 1);
                    break;
                }
            }
        }
        
        if (x == Integer.MAX_VALUE) {
            return -1;
        }
        
        return x;
    }
}
