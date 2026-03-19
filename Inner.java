

// class A{
//     int age;
//     void show(){
//         System.out.println("your age is "+age);
//     }
//     class B{
//         int age;
//         public void config(){
//             System.out.println("your age int class B "+age);
//         }
//     }

//     //this is a static class so we dont need the obj to call it
//     static class C{
//         int age;
//         public C(){
//         System.out.println("constructor calls");
//         }
       
//         public void config1(){
//             System.out.println("you age in class C");
//         }
//     }
// }


// public class Inner {
//     public static void main(String[]args){
//          A obj=new A();


//          //this is when the inner class is non_static
//          A.B obj1=obj.new B();
//          obj.show();
//         // obj.config();
//        obj1.config();


//        //when the class is static class then this way we have to call it
//        A.C obj3= new A.C();
       




//     }
// }



//for the annonymous inner class in java

// class A{
//     public void show(){
//         System.out.println("int the class A");
//     }


// }
// public class Inner{
//     public static void main(String []args){
//         A obj=new A(){
//             //this is  the annonymous inner class
//             public void show(){
//                 System.out.println("in the new class");
//             }
//         };
//      obj.show();

//     }
// }




//here the use of abstract with the annonymous clas
 abstract class A{
    public void show(){
        System.out.println("int the class A");
    }


}
public class Inner{
    public static void main(String []args){
        A obj=new A(){
            //this is  the annonymous inner class
            public void show(){
                System.out.println("in the new class");
            }
        };
        //the obj is not the object of the abstract class but it is the object of the annonymous class
        
     obj.show(); 

    }
}