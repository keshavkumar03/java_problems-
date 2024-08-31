public class min_array {

public static void min(int[]arr) {
    int minValue=arr[0];

    for(int i=0;i<arr.length;i++){
        if(arr[i]<minValue){
            minValue=arr[i];
        }

    }
    System.out.println(minValue);
}

    public static void main(String[] args) {
        int[]array={11,5,2,7,3,10};
        min(array);
    }
}
