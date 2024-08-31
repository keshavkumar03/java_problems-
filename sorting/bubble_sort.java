package sorting;

import java.util.Arrays;

public class bubble_sort {

public  static void  bubble(int[]arr){
    int n= arr.length;
    for(int i=0;i<=n-1;i++){
        boolean swap=false;
        for(int j=0;j<n-i-1;j++){
            
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                 swap=true;
            }
        }
        if(!swap){
            break;
        }
    }
    System.out.println(Arrays.toString(arr));
}

    public static void main(String[] args) {
        int[]array={1,2,22,54,67,32,45,89,43};
        bubble(array);
    }
}
