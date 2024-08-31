import java.util.*;

/**
 * StringOperations
 */
public class StringOperations {

    public static void main(String[] args) {
        String a="Keshav";
        String b=new String("keshav");
        String  c= "kumar";
        String d="    Keshav Kumar   ";
        
        System.out.println(a.equals(b)); 
        System.out.println(a.charAt(0));
        System.out.println(a.length());
        System.out.println(a.substring(2,5));
        System.out.println(a.indexOf("s"));
        System.out.println(a.compareTo(c));
        System.out.println(a.concat("kumar"));
        System.out.println(a);
        System.out.println(a.contains("h"));
        System.out.println(a.matches(c));
        System.out.println(a.toCharArray());
        System.out.println(a.getBytes());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a);//immutabilty
        System.out.println(a.subSequence(2,4));
        System.out.println(a.replace("Keshav", "Kumar"));
        System.out.println(a.replaceAll("K", "s"));
        System.out.println(d);
        System.out.println(d.trim());
        System.out.println(a.split("e"));
        System.out.println(a.codePointAt(4));
        System.out.println(a + 1);
        System.out.println('a' + 1);
        System.out.println( (char)('a' + 1));
        System.out.println('a' + "b");

        System.out.printf("my name is %s",a);
        
        
        




        


    
    }
}