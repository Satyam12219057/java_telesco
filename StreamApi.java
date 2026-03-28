// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.function.Consumer;

// class StreamApi{
//     public static void main(String []args){
//         //List<Integer>nums=new ArrayList<>();

//         List<Integer>nums=new Arrays.asList(1,2,3,4,5,6);
//         // Consumer<Integer>con=new Consumer<Integer>() {
//         //     public void accept(Integer n){
//         //       System.out.println(n);
//         //     }
//         // };

//         //same thongs with the lambda function

//          Consumer<Integer>con=(Integer n)->{
//             System.out.println(n);
//          };


//         nums.forEach(con);



//     }
// }

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

// public class StreamApi{
//     public static void main(String []args){
//         List<Integer>nums=Arrays.asList(1,2,3,4,5,67);
//     //    Stream<Integer>s1=nums.stream();
//     //    Stream<Integer>s2=s1.filter(n->n%2==0);
//     //    Stream<Integer>s3=s2.map(n->n*2);
//     //    int val=s3.reduce(0,(c,e)->(c+e));
//     //    System.out.println(val);

//     //    s3.forEach(n->System.out.println(n));

//     int result=nums.stream()
//         .filter(n->n%2==0)
//         .map(n->n*2)
//         .reduce(0,(c,e)->c+e);
//     System.out.println(result);
//     }
// }



//here we have to learn how  these function work and we have to manually implent it
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi{
    public static void main(String []args){
        List<Integer>nums=Arrays.asList(1,2,3,4,5,67);
        Predicate<Integer>p=new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n%2==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        };

        //how the map works
        Function<Integer,Integer>func=new Function<Integer,Integer>() {
            public  Integer apply(Integer n){
                return n*2;
            }
        };

    
    // int result=nums.stream()
    //     .filter(p)//needs the
    //     .map(func)
    //     .reduce(0,(c,e)->c+e);
    // System.out.println(result);


    Stream<Integer>sortedValue=nums.stream()
    .filter(n->n%2==0)
    .sorted();
    sortedValue.forEach(n->System.out.println(n));

    }
}