import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Operation_class {
    public static void main(String[]args){
        List<String>names=Arrays.asList("pushpam","ritvik","nitish","satyam");
        // String name=names.stream()
        // .filter(str->str.contains("y"))
        // .findFirst();

        //the issue will be solved by the operational class
         Optional<String> name=names.stream()
        .filter(str->str.contains("y"))
        .findFirst();
        System.out.println(name.orElse("not found"));
    }


}
