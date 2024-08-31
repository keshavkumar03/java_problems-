public class Methods {
    public static void main(String[] args) {


        loop1(2,10);

        int area_of_rectangle=area(10,12);
        System.out.println("area of rectangle:  " + area_of_rectangle);
        int area_of_SQUARE1=area(12);
        System.out.println("area of SQUARE 1:  " + area_of_SQUARE1);
        double area_of_SQUARE2=area(12.59765);
        System.out.println("area of SQUARE 2:  " + area_of_SQUARE2);


    }
    //method without return type (using void)
    public static void loop1(int start,int stop) {
        for(int i=start;i<=stop;i++){
            System.out.println("hello");
        }
        
    }
    //method with return type (int is used which means the method should return int )
    public static int area(int length,int breath) {
        return length*breath;
        }
        //method overloading
        //1. by parameter;
    public static int area(int side) {
        return side*side;
        }
       //2.by type of return
        public static double area(double side) {
            return side*side;
            }
}
