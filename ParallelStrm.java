import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStrm {
    public static void main(String[]args){
      int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();

        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }
        // int sum1=nums.stream()
        // .map(i->i*2)
        // .reduce(0,(c,e)->c+e);


        //here we check the what are the difference in the stream and the parallel stream


        long startSeq=System.currentTimeMillis();
        int sum2=nums.stream()
        .map(i->i*2)
        .mapToInt(i->i)//convert Integer to Int
        .sum();

        long endSeq=System.currentTimeMillis();

         long startPar=System.currentTimeMillis();
        int sum3=nums.parallelStream()
        .map(i->i*2)
        .mapToInt(i->i)
        .sum();
        long endParallel=System.currentTimeMillis();


    System.out.println("seq : "+(endSeq-startSeq));
    System.out.println("parallel: " + (endParallel-startPar));
        System.out.println(" "+sum2+" "+sum3);  
    }
}



