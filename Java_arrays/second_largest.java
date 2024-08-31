public class second_largest {

    public static int secondMaxOfArray(int[]array){
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        int size=array.length;
        for(int i=0;i<size;i++){
            if(largest<array[i]){
                secLargest=largest;
                largest=array[i];
            }
            else if (array[i]<largest&&array[i]>secLargest) {
                secLargest=array[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,23,4,211,456,200,4,300};
        int second=secondMaxOfArray(arr);
      System.out.println(second);
    }
}
