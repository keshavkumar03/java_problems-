public class Fibonacci {
    public static void fiboseq(int prev1, int prev2, int count) {
        if (count > 0) { // Base case: stop recursion when count reaches 0
            int fiboNo = prev1 + prev2;
            System.out.println(fiboNo);
            fiboseq(prev2, fiboNo, count - 1); // Recursive call with updated values and decremented count
        }
    }

    public static int fibonum(int n){
        if(n<=1) { 
            return n;}
       
         return fibonum(n-1)+fibonum(n-2);
    }

    public static void main(String[] args) {
        // System.out.println(0); // First Fibonacci number
        // System.out.println(1); // Second Fibonacci number
        fiboseq(0, 1, 100); // Generate the next 10 Fibonacci numbers

        System.out.println(fibonum(19));
    }
}
