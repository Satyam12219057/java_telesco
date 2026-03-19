
//abstract class

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    
}
 abstract class WagonR extends Car{
   
    public  void drive(){
        System.out.println("driving");
    }
}

class UpdatedWagonR extends WagonR{//concate class we have to create the object of it
    public  void fly(){
    System.out.println("flying");
    }

}
public class Demo{
    public static void main(String[]args){
        


    }
}