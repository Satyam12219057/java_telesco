// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// public class Advance {
//     public static void main(String[]args){
//       List<Integer> nums=new ArrayList<Integer>();
//     // Collection nums=new ArrayList();
//       nums.add(6);
//       nums.add(7);
//       nums.add(8);
//       nums.add(9);
     

//       System.out.println(nums.get(2));//it will get the element at the index
//       for(int n:nums){
//         System.out.println(n);
//       }

//     //ArrayList work with the object 
//     for(Object n:nums){
//         int num=(Integer)n;
//         System.out.println(num*2);
//     }

     
//     }
// }


//here we are going to store the value with the proper index
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Advance1{
    public static void main(String[]args){
        Map<String, Integer>student=new HashMap<>();
        student.put("navin",10);
        student.put("Satyam",100);
        student.put("na",120);
        student.put("Sa",130);
        System.out.println(student);

        System.out.println(student.get("navin"));
        
        //we have to get all the keys
        for(String key:student.keySet()){
            System.out.println(key +" "+student.get(key));
        }

        



    }
}


