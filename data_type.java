import java.io.*;
import java.util.*;
import java.lang.Math;

class data_type{
    public static void main(String []args)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String str=" can be fitted in:";
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+str);
                byte_check(x);
                short_check(x);
                int_check(x);
                long_check(x); 
               


            }
            
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    public static void byte_check(long x){
        String str="";
        if(x>=-128 && x<=127){
            str="* byte";
            System.out.println(str);
        }
        
    }
    public static void short_check(long x){
        String str="";
        if(x>=-32768 && x<=32767){
            str="* short";
            System.out.println(str);
        }
        
    }
    public static void int_check(long x){
        String str="";
        if(x>=Math.pow(-2,31) && x<=Math.pow(2,31)-1){
            str="* int";
            System.out.println(str);
        }
       
    }
    public static void long_check(long x){
        String str="";
        if(x>=Math.pow(-2,63) && x<=Math.pow(2,63)-1){
            str="* long";
           System.out.println(str);
        }
        
    }
}



