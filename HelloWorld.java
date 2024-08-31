
class helper{
    void sayHello(){
        System.out.println("hi this a supporting class in same file");
    }
    }
    


public class HelloWorld {
    public static void main(String[] args){
   System.out.println("hellow world");


   //other classes in same file
   helper help=new helper();
   //other class in different file
   helperTwo helpTwo =new helperTwo();
   help.sayHello();
   helpTwo.sayBye();
    }
}
