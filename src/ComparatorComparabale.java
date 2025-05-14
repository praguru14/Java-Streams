import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorComparabale {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student(1, "Alice Johnson", 20, "A"));
        studentArrayList.add(new Student(2, "Bob Smith", 21, "B"));
        studentArrayList.add(new Student(3, "Charlie Brown", 19, "A"));
        studentArrayList.add(new Student(4, "David Williams", 22, "C"));
        studentArrayList.add(new Student(5, "Emily Davis", 20, "B"));
        studentArrayList.add(new Student(6, "Franklin Moore", 23, "A"));
        studentArrayList.add(new Student(7, "Grace White", 18, "A"));
        studentArrayList.add(new Student(8, "Henry Lewis", 21, "B"));
        studentArrayList.add(new Student(9, "Isla Scott", 19, "C"));
        studentArrayList.add(new Student(10, "Jack Thompson", 22, "A"));

        List<Student> studentStream = studentArrayList.stream().filter(i -> i.getAge() % 2 == 0).collect(Collectors.toList());

        Collections.sort(studentArrayList, new NameId() {
       });
        System.out.println(studentStream);
    }


}






 class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private int age;
    private String grade;

    // No-args constructor
    public Student() {
    }

    // All-args constructor
    public Student(Integer id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

     @Override
     public int compareTo(Student o) {
        Integer.compare(this.age,o.age);
         return this.getAge()-o.getAge();
     }
 }


 class IdComp implements Comparator<Student>{

     @Override
     public int compare(Student o1, Student o2) {
        return o1.getGrade().compareTo(o2.getGrade());
     }
 }

class NameId implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}