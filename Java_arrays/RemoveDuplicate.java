 import java.util.*;

// Given an array of integers, remove duplicates from it and return the new array.


public class RemoveDuplicate{
public static void dupicate(int[]array){
    Set<Integer> set=new HashSet<>();
    List<Integer> list=new ArrayList<>();

    for(int i=0;i<array.length;i++){
        if(!set.contains(array[i])){
            set.add(array[i]);
            list.add(array[i]);
        }
    }
    System.out.println(list);
}

 public static void main(String[]args){
int[] array={1,2,3,2,4,5,6,7,8};
 dupicate(array);
 System.out.println(Arrays.toString(array)); //original value remains same due to pass by value
 }
} 
