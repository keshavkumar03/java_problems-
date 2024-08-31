import java.util.*;


public class NextGreat{
    public static void Nextgrestest2(int[]array){
     Stack<Integer> stack=new Stack<>();
      for(int i=array.length-1;i>=0;i--){
        while(!stack.isEmpty() && stack.peek()<=array[i]){
          stack.pop();
        }
        if(!stack.isEmpty()){
          System.out.println(stack.peek());
        }else{
          System.out.println("-1");
        }
        stack.push(array[i]);
      }
    }
    public static void Nextgrestest1(int[]array){
      for(int i=0;i<array.length;i++){
        boolean found=false;
        for(int j=i+1;j<array.length;j++){
            if(array[i]<array[j]){
              System.out.println(array[j]);
              found = true;
              break;
            }
             
      }
      if (!found) {
        System.out.println("-1");
    }
    }
    }
    public static void main(String[] args) {
        int[]arr={4,5,2,25};
        int[]arr2={5,7,1,7,6,0};

        Nextgrestest2(arr);
        //Nextgrestest1(arr2);

    }
}