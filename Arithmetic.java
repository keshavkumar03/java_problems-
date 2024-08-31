public class Arithmetic {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        int rem=a%b;
        int postfix=a++;
        int prefix= ++a;

        System.out.println("a=: " + a);
        System.out.println("b=: " + b);
        System.out.println("addition: " + sum);
        System.out.println("subtraction: " + sub);
        System.out.println("multipction: " + mul);
        System.out.println("divisoion: " + div);
        System.out.println("floor divison: " + rem);
        System.out.println("postfix: " + postfix);
        System.out.println("prefix: " + prefix);
        
        

    }
}
