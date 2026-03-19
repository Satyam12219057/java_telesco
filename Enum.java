// enum Status{
//     Running,Failed,Pending,Success;
// }

// public class Enum {
//     public static void main(String []args){
//         int i=5;
//         Status s=Status.Running;
//         System.out.println(s.ordinal());

//         //if i want to print all the status of the enum

//         //gives all the status 
//         Status[]ss=Status.values();

//         for(Status st:ss){
//             System.out.println(st+"this is your current number"+st.ordinal());
//         }


//     }
    
// }


//


// enum Status{
//     Running,Failed,Pending,Success;
// }

enum Laptop{
   Macbook(200),XPS(200),Surface,ThinkPad(1800); 
   private int price;

   private Laptop(int price) {
    this.price = price;
}

   public int getPrice() {
    return price;
}

   public void setPrice(int price) {
    this.price = price;
}


   
}
public class Enum{
    public static void main(String[]args){

       // Status s=Status.Pending;
        // switch(s){
        //     case Running:
        //         System.out.println("All good");
        //     break;
        //     case Failed:
        //         System.out.println("Try Again");
        //     break;
        //     case Pending:
        //         System.out.println("Please wait");
        //     break;
        //     default:
        //         System.out.println("please wait");
        //         break;

        // }

        //same thigs are done by here 





    //   if(s==Status.Running){
    //     System.out.println("All good");

    //   }
    //   else if(s==Status.Failed){
    //     System.out.println("Try again");

    //   }
    //   else if(s==Status.Pending){
    //     System.out.println("please wait");
    //   }
    //   else{
    //     System.out.println("success properly");
    //   }

//     Status s=Status.Success;
//    //this way we know the parent of the current class
//     System.out.println(s.getClass().getSuperclass());

// Laptop lap=Laptop.Macbook;
// System.out.println(lap+" : "+lap.getPrice());

for(Laptop lap:Laptop.values()){
    System.out.println(lap +" : "+lap.getPrice());
}


    }
}
