public class frequency {
// public static int  printFrequency2(int[]arr){

// }
public static void printFrequency1(int[] array){

int n=array.length;

boolean[] vistied=new boolean[n];
for(int i=0;i<n;i++){
     int count=1;
for(int j=i+1;j<n;j++){
    if(array[i]==array[j]){
        count++;
    }

}
int[]array2=new int[n];
System.out.println(count);
}

}



    public static void main(String[] args) {
        int[]arr={1,43,22,22,45,1,45,67,34,67,44,22};
        printFrequency1(arr);
    }
}
