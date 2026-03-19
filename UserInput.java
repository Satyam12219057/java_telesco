//how to take input from the user
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class UserInput {
    public static void main(String[]args){
      int i=0;
      int j=0;
      int num=0;
      

       //try with finally
    //           try{
    //     InputStreamReader in=new InputStreamReader(System.in);
    //       br=new BufferedReader(in);
    //      num=Integer.parseInt(br.readLine());
        
    //    }
    //    catch(Exception e){
    //        System.out.println("something get wrong");
          
    //    }
    //    finally{
    //      br.close();
    //    }


    //try with the resource when try get over it automatically closed
     try(BufferedReader br=new BufferedReader(new InputStreamReader((System.in)))){
      num=Integer.parseInt(br.readLine());
      System.out.println(br);
     }
  
    }
    
}
