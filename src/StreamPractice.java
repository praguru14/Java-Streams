import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

static class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}

public static void main(String[] args) {
    // EASY QUESTIONS
//
//    // 1. Count strings starting with a given letter
//    List<String> names = Arrays.asList("Alice", "Adam", "Bob", "Alex");
//
//
//    // 2. Find length of longest string
//    List<String> strings = Arrays.asList("hi", "hello", "world");
////    System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));
//
//    strings.stream().mapToInt(String::length).max().ifPresent(System.out::println);
//
//    // 3. Square each number in a list
//    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//
//    // 4. Get list of strings longer than 4 characters
//    List<String> words = Arrays.asList("car", "banana", "bus", "elephant");
//
//
//    // 5. Check if all numbers are even
//    List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
//
//    // 6. Convert list of strings to uppercase
//    List<String> values = Arrays.asList("a", "b", "c");
////    values.stream().map(i->i.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
//
//    // 7. Remove empty strings from a list
//    List<String> items = Arrays.asList("java", "", "code", "");
//    items.stream().filter(i->i.length()>0).collect(Collectors.toList()).forEach(System.out::println);
//
//    // 8. Find maximum number
//    List<Integer> maxNumbers = Arrays.asList(10, 25, 15, 5);
//
//    // 9. Count number of unique elements
//    List<Integer> uniques = Arrays.asList(1, 2, 3, 2, 3, 4);
//
//    // 10. Concatenate list of strings with delimiter
//    List<String> concatWords = Arrays.asList("apple", "banana", "cherry");
//    System.out.println(concatWords.stream().collect(Collectors.joining("-")));
//
//    // MEDIUM QUESTIONS
//
//    // 1. Group strings by their length
//    List<String> groupWords = Arrays.asList("one", "three", "four", "ten");
//
//    // 2. Get top 3 highest numbers
//    List<Integer> topNumbers = Arrays.asList(50, 20, 60, 10, 90);
//
//    // 3. Count frequency of each character
//    String input = "aabbcccde";
//
//    // 4. Sort Map by value
//    Map<String, Integer> map = Map.of("A", 5, "B", 2, "C", 8);
//    map.entrySet().stream().map(e->e.getKey()).sorted().forEach(System.out::println);
//
//    // 5. Get employee names from a specific department
//    List<Employee> employees = Arrays.asList(
//            new Employee("Ram", "IT", 40000),
//            new Employee("Shyam", "HR", 30000)
//    );
//    Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//
//    // 6. Find duplicate elements in list
//    List<String> dupItems = Arrays.asList("apple", "banana", "apple", "orange");
//    LinkedHashMap<String, Long> collect1 = dupItems.stream().collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//    System.out.println(collect1.toString());
//    collect1.entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);
//    // 7. Sort list of employees by salary (desc)
//    List<Employee> salaryEmployees = Arrays.asList(
//            new Employee("X", "QA", 50000),
//            new Employee("Y", "Dev", 60000)
//    );
//
//    // 8. Merge two lists and remove duplicates
//    List<Integer> list1 = Arrays.asList(1, 2, 3);
//    List<Integer> list2 = Arrays.asList(3, 4, 5);
//
//    // 9. Convert list of integers to comma-separated string
//    List<Integer> numsToJoin = Arrays.asList(1, 2, 3);
//
//    // 10. Find the second lowest salary
//    List<Employee> secondLow = Arrays.asList(
//            new Employee("Z", "Ops", 20000),
//            new Employee("A", "IT", 30000),
//            new Employee("B", "IT", 40000)
//    );
//
//    // HARD QUESTIONS
//
//    // 1. Find employee with 2nd highest salary in each department
//    List<Employee> deptEmployees = Arrays.asList(
//            new Employee("John", "IT", 60000),
//            new Employee("Jane", "IT", 70000),
//            new Employee("Tom", "HR", 50000),
//            new Employee("Jerry", "HR", 40000)
//    );
//
//    // 2. Find longest palindrome in a list of strings
//    List<String> palindromes = Arrays.asList("level", "radar", "apple", "madam");
//
//    // 3. Flatten nested list of integers
//    List<List<Integer>> nested = Arrays.asList(
//            Arrays.asList(1, 2),
//            Arrays.asList(3, 4)
//    );
//
//    // 4. Find top N frequent elements
//    List<String> freqItems = Arrays.asList("a", "b", "a", "c", "b", "a");
//
//    // 5. Sort employees by department then salary
//    List<Employee> sortDeptSalary = Arrays.asList(
//            new Employee("A", "HR", 30000),
//            new Employee("B", "HR", 20000),
//            new Employee("C", "IT", 50000)
//    );
//
//    // 6. Find average salary per department, then filter departments > 50k
//    List<Employee> avgSalary = Arrays.asList(
//            new Employee("D", "Sales", 60000),
//            new Employee("E", "Sales", 70000),
//            new Employee("F", "Marketing", 40000)
//    );
//
//    // 7. Find top 2 employees with highest salary per department
//    List<Employee> top2Employees = Arrays.asList(
//            new Employee("G", "Dev", 80000),
//            new Employee("H", "Dev", 75000),
//            new Employee("I", "Dev", 72000)
//    );
//
//    // 8. Reverse a string using streams
//    String inputStr = "stream";
//
//    // 9. Get department-wise total salary
//    List<Employee> totalSalary = Arrays.asList(
//            new Employee("X", "Admin", 45000),
//            new Employee("Y", "Admin", 55000)
//    );
//
//    // 10. Implement pagination logic using streams
//    List<Integer> pageList = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
//    int page = 2, size = 10;



    List<String> words1 = Arrays.asList("apple", "banana", "cherry");

//    System.out.println(words1.stream().map(String::length).collect(Collectors.toList()));
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    System.out.println(words.stream().mapToInt(String::length).sum());

    String str = "java";
    List<Character> collect = str.chars().mapToObj(c ->(char) c).collect(Collectors.toList());
    System.out.println(collect);

}
