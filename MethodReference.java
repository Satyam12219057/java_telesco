import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[]args){
        List<String>names=Arrays.asList("Navin","Harsh","John");
        // List<String>uName=names.stream()
        // .map(name->name.toUpperCase())
        // .toList();

        //same things in java we do by different ways using methord reference
        List<String>uName=names.stream()
           .map(String :: toUpperCase) //this is called the method reference
           .toList();
           //both the lines doing the same things in java by method referenec
        uName.forEach(i->System.out.println(i));
        uName.forEach(System.out::println);
        
        System.out.println(uName);
    }
    
}
