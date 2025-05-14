package sixapril25;//package sixapril25;
//
//import java.util.*;
//import java.util.stream.*;
//import java.util.function.*;
//
//public class StreamPractice {
//
//    static class Employee1 {
//        String name;
//        double salary;
//        String dept;
//
//        Employee1(String name, double salary, String dept) {
//            this.name = name;
//            this.salary = salary;
//            this.dept = dept;
//        }
//
//        String getName() { return name; }
//        double getSalary() { return salary; }
//        String getDept() { return dept; }
//    }
//
//    public static void main(String[] args) {
//        // EASY LEVEL
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        // 1. Filter even numbers from the list using Stream API
//        numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
//
//        List<String> names = Arrays.asList("ram", "shyam", "geeta");
//        // 2. Convert all names to uppercase using Stream
//        names.stream().map(c->c.toUpperCase()).forEach(System.out::println);
//
//        List<String> fruits = Arrays.asList("Banana", "Apple", "Avocado", "Mango");
//        // 3. Find the first fruit that starts with "A"
//        fruits.stream().filter(f->f.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
//
//        List<Integer> marks = Arrays.asList(45, 89, 32, 76, 99);
//        // 4. Sort the list in ascending order using Stream
//        marks.stream().sorted().forEach(System.out::println);
//
//        // MEDIUM LEVEL
//
//        List<String> cities = Arrays.asList("NY", "Delhi", "London", "Paris");
//        // 5. Count how many city names have length > 3
//
//        List<String> animals = Arrays.asList("Cat", "Dog", "Cat", "Cow", "Dog");
//        // 6. Remove duplicates using Stream
//        Map<String, Long> collect = animals.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        collect.entrySet().stream().filter(i->i.getValue()==1).collect(Collectors.toList()).forEach(System.out::println);
//        List<Employee1> empList = Arrays.asList(
//                new Employee1("A", 60000, "HR"),
//                new Employee1("B", 40000, "IT"),
//                new Employee1("C", 70000, "HR")
//        );
//        // 7. Get names of employees with salary > 50K using Stream
//
//        empList.stream().filter(e->e.getSalary()>50000).map(Employee1::getName).toList().forEach(System.out::println);
//
//        // 8. Convert List<Employee1> to Map<String, Double> where key is name and value is salary
//
//        // HARD LEVEL
//
//        // 9. Group employees by department using Collectors.groupingBy
//
//        List<Integer> salaries = Arrays.asList(10000, 50000, 30000, 70000, 60000);
//        // 10. Find second highest salary using Stream
//
//        List<String> words = Arrays.asList("Stream", "Collection", "Lambda", "API");
//        // 11. Find the longest string using Stream
//
//        List<List<String>> nestedList = Arrays.asList(
//                Arrays.asList("a", "b"),
//                Arrays.asList("c", "d")
//        );
//        // 12. Flatten nested list to single list ["a", "b", "c", "d"] using flatMap
//
//        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        // 13. Partition numbers into even and odd using Collectors.partitioningBy
//    }
//}


import java.util.*;
import java.util.stream.*;

class Employee1 {
    String name;
    String department;
    String role;

    Employee1(String name, String department, String role) {
        this.name = name;
        this.department = department;
        this.role = role;
    }

    @Override
    public String toString() {
        return STR."\{name} (\{department}, \{role})";
    }
}

public class StreamLambdaExercises {
    public static void main(String[] args) {

        // 1. Flatten a List of Lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6)
        );
        listOfLists.stream().flatMap(List::stream).forEach(System.out::println);
        // Your code for flattening here

        // 2. Find First Non-Repeated Element
        List<Integer> numbers = Arrays.asList(4, 5, 2, 4, 5, 6, 7);
        numbers.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);

        // Your code for finding first non-repeated here

        // 3. Group By Multiple Fields (e.g., department and role)
        List<Employee1> employees = Arrays.asList(
                new Employee1("John", "IT", "Developer"),
                new Employee1("Jane", "HR", "Manager"),
                new Employee1("Alex", "IT", "Manager")
        );

        // Your code for grouping here

        // 4. Partition a List into Two Lists (e.g., even and odd numbers)
        List<Integer> numbersForPartition = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Your code for partitioning here

        // 5. Sum of Squares of Even Numbers
        List<Integer> numbersForSum = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Your code for sum of squares here

        // 6. Remove Duplicates from a List
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        // Your code for removing duplicates here
    }
}
