package sixapril25;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streams {

    public static void main(String[] args) {
        Streams s = new Streams();

        // Sample Data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3);
        String inputStr = "programming";
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grapefruit");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000, "IT"),
                new Employee("Jane", 60000, "HR"),
                new Employee("Jake", 80000, "IT"),
                new Employee("Jill", 40000, "Finance")
        );

        // Call methods with sample data
        s.findEvenNumbers(numbers);
        s.firstNonRepeatingChar(inputStr);
        s.charFrequency(inputStr);
        s.sortByLengthDesc(words);
        s.findDuplicates(numbers);
        s.getMaxSalaryEmployee(employees);
        s.groupByDepartment(employees);
        s.joinStrings(names);
        s.findSecondHighest(numbers);
        s.partitionEvenOdd(numbers);
    }

    // 1. Find All Even Numbers from a List
    public List<Integer> findEvenNumbers(List<Integer> numbers) {
     List<Integer> even =    numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even.toString());
        return even;
    }

    // 2. Find the First Non-Repeating Character in a String
    public Optional<Character> firstNonRepeatingChar(String input) {
//        System.out.println(input);
        LinkedHashMap<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(collect.toString());
        collect.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
        return Optional.empty();
    }

    // 3. Count Frequency of Each Character in a String
    public Map<Character, Long> charFrequency(String input) {
        LinkedHashMap<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect.toString());
        return null;
    }

    // 4. Sort a List of Strings by Length in Descending Order
    public List<String> sortByLengthDesc(List<String> words) {
        List<Integer> collect = words.stream().map(c -> c.length()).collect(Collectors.toList());
        List<Integer> sorted = collect.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted.toString());
        return null;
    }

    // 5. Find Duplicate Elements in a List
    public Set<Integer> findDuplicates(List<Integer> numbers) {
        Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        System.out.println(collect.toString());
        System.out.println(collect.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()));
        return null;
    }

    // 6. Find the Maximum Salary from a List of Employees
    public Optional<Employee> getMaxSalaryEmployee(List<Employee> employees) {
        System.out.println(employees.toString());
        Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(max.get().toString());
        return Optional.empty();
    }

    // 7. Group Employees by Department
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(collect.toString());
        return null;
    }

    // 8. Convert a List of Strings to a Single Comma-Separated String
    public String joinStrings(List<String> names) {
        System.out.println(names.toString());
        String collect = names.stream().collect(Collectors.joining(","));
        System.out.println(collect);
        return null;
    }

    // 9. Find the Second Highest Number in a List
    public Optional<Integer> findSecondHighest(List<Integer> numbers) {
        System.out.println(numbers.toString());
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).stream().skip(1).findFirst().ifPresent(System.out::println);
        return Optional.empty();
    }

    // 10. Partition a List of Integers into Even and Odd
    public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {

        return null;
    }

    // Helper Employee class
    public static class Employee {
        private String name;
        private double salary;
        private String department;

        public Employee(String name, double salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return name + " (" + department + ") - $" + salary;
        }
    }
}
