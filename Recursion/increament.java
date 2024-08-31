package Recursion;

public class increament {
    public static void decrease(int a){
      if(a==0){
     return;
    }
    System.out.println(a);
    //decrease(a--);
    decrease(--a);
    
    }
    public static void main(String[] args) {
        decrease(10);
    }
}
