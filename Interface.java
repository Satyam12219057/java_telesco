//   //it is not the class it just show the design
// interface A{
//     int age=44;
//     String area="Mumbai";
//     void show();
//     void config();
// }

// interface X{
//     void calculate();
//     void understand();
// }

// interface Y extends X{ 
   
// }

// //its my duties to define all the methods of the interface
// class B implements A,X{

//     @Override
//     public void show() {
//        System.out.println("in this interface show");
//     }

//     @Override
//     public void config() {
//          System.out.println("in this interface1 show");
       
//     }
//    public  void calculate(){
//     System.out.println("calculate the value");
//     }
//      public void understand(){
//         System.out.println("understand  the  logic value");
        
//     }
    
// }
// public class Interface {
//     public static void main(String[]args){
// //now we can create the object of the class
//     A obje=new B();
//     obje.show();

//     X obj1=new B();
//     obj1.calculate();
//     }
// }





//functional interface

//Lambda function is only use with the functional interface
// @FunctionalInterface
// interface A{
// void show();

// }
// // class B implements A{
// //     public void show(){
// //         System.out.println("in the functional interface");
// //     }
// // }
// public class Interface{
//     public static void main(String[]args){
//       //   with normal class
//     // A obj=new B();
//     // obj.show();


//     //with annonymous
//     //we have to do the same thigs using annonmous class
//     // A obj=new A(){
//     //     public void show(){
//     //       System.out.println("in the same functional interface with the annonymous clas");
//     //     }

//     // };

//     A obj=()->{
//         System.out.println("in the lambda expression");
//     };

//     }
// }


//lambda function with return type

@FunctionalInterface
interface A{
    int show(int a,int b);

    
}
public class Interface{
    public static void main(String []args){
      A obj=(int a,int b)->{
        return a+b;
      };
      int ans=obj.show(2,4);
      System.out.println(ans);
    }

}