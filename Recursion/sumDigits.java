package Recursion;

public class sumDigits {
    public static int sum(int n){
        if(n==0){
            return 0;
        }

        else{
            return n%10+sum(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(2314));
    }
}
