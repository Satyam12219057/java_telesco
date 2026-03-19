// public class Exception1 {
//     public static void main(String[]args){
//         int i=2;
//         int j=0;
//         int nums[]=new int[5];
//         try{
//          j=18/i;
//          System.out.println(nums[5]);
//         }
//         catch(ArithmeticException obj){
//             System.out.println("something went wrong"+obj);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("stay in your limit"+e);
//         }
//         catch(Exception e){
//             System.out.println("something went wrong"+e);
//         }
//         System.out.println(j);
//         System.out.println("bye");
//     }
// }



//here we can handle the exception
// class EXception1{
//     public static void main(){
//         int i=2;
//         int j=0;
//         try{
//         j=18/i;
//         if(j==0){
//             throw new ArithmeticException("i dont want to print the exception");
//         }
//         }
//         catch(ArithmeticException e){
//             j=18/1;
//             System.out.println("thats the default value output");
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong"+e);
//         }

//         System.out.println(j);
//     }
// }




//maid our own exception according to the requirements

class NewException extends Exception{
    public NewException(String string){
        super(string);
    }
}
public class Exception1{
    public static void main(String []args){
        int i=2;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new NewException("please select any other value");
            }
        }
        catch(Exception e){
            System.out.println("choose the value of i greate than 0"+e);
        }
    }

}