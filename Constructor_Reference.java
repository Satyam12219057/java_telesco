import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
   
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
   
}

public class Constructor_Reference {
    public static void main(String[]args){
        List<String>names=Arrays.asList("Navin","Harsh","john");
        List<Student>students=new ArrayList<>();
    // for(String name:names){
    //     students.add(new Student(name,0));

    // }
    // System.out.println(students);

    //same things are done by the stream 
    students=names.stream()
    .map( name->new Student(name,0))
    .toList();


    }    
}
