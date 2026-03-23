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
// import java.util.Collection;
// import java.util.HashMap;
// import java.util.Map;

// public class Advance1{
//     public static void main(String[]args){
//         Map<String, Integer>student=new HashMap<>();
//         student.put("navin",10);
//         student.put("Satyam",100);
//         student.put("na",120);
//         student.put("Sa",130);
//         System.out.println(student);

//         System.out.println(student.get("navin"));
        
//         //we have to get all the keys
//         for(String key:student.keySet()){
//             System.out.println(key +" "+student.get(key));
//         }

        



//     }
// }

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//now we are lern the use of the list with the user defined dataTYpe
class Student{
    public int age;
    public String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    
}


public class Advance1{
    public static void main(String[]args){
        Comparator<Integer>com=new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10> j%10){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };
       
        List<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.add(29);
        nums.add(6);
        nums.add(7);
        System.out.println(nums);
       Collections.sort(nums);
       System.out.println(nums);

       //
       List<Student>nums1=new ArrayList<Student>();
       nums1.add(new Student(20,"staym"));
       nums1.add(new Student(21,"Ritvik"));
       nums1.add(new Student(22,"Aman"));
       System.out.println(nums1);


    }
}


