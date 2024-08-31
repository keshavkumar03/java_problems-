package Recursion;

public class reverseNo {
    public static void reverse(int num){
        if(num==0){
           return;
        }
         int rem=num%10;
         int num1=num1*10+rem;
         reverse(num/10);
         System.out.println(num1);
    }

    public static void main(String[] args) {
    reverse(19283);
    }
}
