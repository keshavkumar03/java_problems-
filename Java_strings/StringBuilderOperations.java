import java.util.*;


public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("keshav");

        System.out.println(sb.append("kumar"));
        System.out.println(sb);
        System.out.println(sb.insert(6, " is a "));
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(6, 10));
        System.out.println(sb);



        
    }
}
