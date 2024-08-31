public class max_of_arr {
    public static void main(String[] args) {
       int[]array={1,3,4,5,3,10,40};
      System.out.println( max(array));
    }
     static int max(int[]arr){
            int largest=Integer.MIN_VALUE;

            for(int i=1;i<arr.length;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
        return largest;
    }
}
