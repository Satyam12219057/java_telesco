
//here we are going to extends the thread class but i will get stuct when the class already extends any other class
// class A extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("hii");
//            try{
//              Thread.sleep(10);
//            }
//            catch(InterruptedException e){
//             e.printStackTrace();
//            }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("hello");
//             try{
//                 Thread.sleep(10);//beacuse the sleep will give the exception
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Thread1 {
//     public static void main(String[]args){
//         A obj=new A();
//         B obj1=new B();

         
//         obj.start();
//          try{
//                 Thread.sleep(2);//beacuse the sleep will give the exception
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }

//         obj1.start();


//     }
    
// }



//so we use the interface runnable
class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hii");
           try{
             Thread.sleep(10);
           }
           catch(InterruptedException e){
            e.printStackTrace();
           }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);//beacuse the sleep will give the exception
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Thread1 {
    public static void main(String[]args){

        //in the runnable we cant have the start method
        Runnable obj=new A();
        Runnable obj1=new B();


        //so we sole it like thart
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1 );
         
        t1.start();
        t2.start();


    }
    
}




