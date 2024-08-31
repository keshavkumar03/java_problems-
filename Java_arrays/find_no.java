package Java_arrays;
import java.util.*;;

public class find_no {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner scan =new Scanner(System.in);
        int search_no=scan.nextInt();
         int index=-1;
        for(int temp=0;temp<=arr.length;temp++){
            if(arr[temp]==search_no){
               index=temp;
                break;
            }
           
        }
       
    }
}
