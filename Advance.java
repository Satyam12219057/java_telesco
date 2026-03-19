import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Advance {
    public static void main(String[]args){
      List<Integer> nums=new ArrayList<Integer>();
    // Collection nums=new ArrayList();
      nums.add(6);
      nums.add(7);
      nums.add(8);
      nums.add(9);
     

      System.out.println(nums.get(2));//it will get the element at the index
      for(int n:nums){
        System.out.println(n);
      }

    //ArrayList work with the object 
    for(Object n:nums){
        int num=(Integer)n;
        System.out.println(num*2);
    }

     
    }
}
