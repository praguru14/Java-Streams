package sixapril25;

import java.util.*;
import java.util.stream.*;

public class StreamsQuestions {

    public static void main(String[] args) {

        // ----------------- EASY -----------------

//        // 1. Count frequency of each character
//        String str1 = "banana";
//       Map<Character,Long> count= str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
//        System.out.println(count);
//
//        // 2. Find unique elements in a list
//        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
////        list1.stream().distinct().forEach(System.out::println);
//
//        // 3. Convert list of strings to uppercase
//        List<String> names1 = Arrays.asList("alice", "bob", "charlie");
////        names1.stream().map(String::toUpperCase).forEach(System.out::println);
//        // 4. Filter even numbers
//        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6);
//        System.out.println(nums1.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet()));
//        // 5. Sum of all numbers
//        List<Integer> nums2 = Arrays.asList(10, 20, 30);
//        Optional<Integer> reduce = nums2.stream().reduce(Integer::sum);
//        System.out.println(reduce.get());
//        // 6. Count words in a sentence
//        String sentence1 = "hello world java streams";
//        sentence1 = sentence1.replaceAll("\\s","");
//        System.out.println(sentence1.chars().count());
//
//        // 7. First non-repeating character
//        String str2 = "swiss";
//        LinkedHashMap<Character, Long> collect = str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//        collect.entrySet().stream().filter(e -> e.getValue() == 1).forEach(e -> System.out.println(e.getKey()));
//        // 8. Join list into comma-separated string
//        List<String> words1 = Arrays.asList("apple", "banana", "cherry");

        // 9. Find max number
//        List<Integer> nums3 = Arrays.asList(1,3,4,2,2);
////        System.out.println(nums3.stream().max(Integer::compareTo));
//        List<Map.Entry<Integer, Long>> collect = nums3.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).collect(Collectors.toList());
//            collect.size()>1
//        // 10. Sort list of strings
//        List<String> names2 = Arrays.asList("David", "Alice", "Eve");
//        System.out.println(names2.stream().collect(Collectors.counting()));

        // ----------------- MEDIUM -----------------
//
//        // 11. Find all duplicates in a list
//        List<Integer> nums4 = Arrays.asList(1, 2, 3, 1, 4, 2);
//        LinkedHashMap<Integer, Long> num = nums4.stream().collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(num.toString());
//        num.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));
//
//        // 12. Group strings by length
//        List<String> strings1 = Arrays.asList("a", "ab", "abc", "abcd", "ab");
//        System.out.println(strings1.stream().collect(Collectors.groupingBy(c -> c.length(), Collectors.counting())));
//
//        // 13. Filter strings starting with specific letter
//        List<String> names3 = Arrays.asList("Sam", "Steve", "Bob", "Alice");
//        names3.stream().filter(i->i.startsWith("S")).forEach(e -> System.out.println(e));
//
//        // 14. Get top 3 highest numbers
//        List<Integer> nums5 = Arrays.asList(3, 99, 12, 45, 100, 5);
//
//        System.out.println(nums5.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));
//
//        // 15. Find the second highest number
//        List<Integer> nums6 = Arrays.asList(3, 5, 7, 2, 8, 6);
//        nums6.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).forEach(e -> System.out.println(e));
//
//        // 16. Find longest string
//        List<String> words2 = Arrays.asList("cat", "elephant", "tiger");
//        Stream<String> sorted = words2.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1);
//        List<String> collect1 = sorted.collect(Collectors.toList());
//        System.out.println(collect1.toString());
//        // 17. Count frequency of words
//        String sentence2 = "apple banana apple mango banana apple";
//        System.out.println(Arrays.stream(sentence2.split(" ")).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
//        // 18. Remove duplicates and sort
//        List<Integer> nums7 = Arrays.asList(5, 3, 2, 3, 5, 1);
//        System.out.println(nums7.stream().distinct().sorted().collect(Collectors.toSet()));
//
//        // 19. Partition list into even and odd
//        List<Integer> nums8 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//
//        // 20. Convert list of strings to map with string and length
//        List<String> words3 = Arrays.asList("dog", "horse", "elephant");
//
//        // ----------------- HARD -----------------
//
//        // 21. Group employees by department and find highest salary
//        List<Employee> employees1 = Arrays.asList(
//                new Employee("John", "HR", 50000),
//                new Employee("Jane", "IT", 80000),
//                new Employee("Jake", "HR", 55000),
//                new Employee("Jill", "IT", 90000)
//        );
//        Map<String, List<Employee>> employeesByDept = employees1.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//
//        employeesByDept.forEach((dept, empList) -> {
//            System.out.println("Department: " + dept);
//            empList.forEach(e -> System.out.println("  " + e));
//        });
//
//        // 22. Find longest palindrome in list of strings
//        List<String> words4 = Arrays.asList("level", "hello", "radar", "world");
//
//        // 23. Flatten nested list
//        List<List<String>> nestedList = Arrays.asList(
//                Arrays.asList("a", "b"),
//                Arrays.asList("c", "d")
//        );
//
//        // 24. Find common elements between two lists
//        List<Integer> nums9 = Arrays.asList(1, 2, 3, 4);
//        List<Integer> nums10 = Arrays.asList(3, 4, 5, 6);
//        nums10.stream().filter(nums9::contains).collect(Collectors.toList()).forEach(e -> System.out.println(e));
//        // 25. Anagram grouping
//        List<String> anagrams = Arrays.asList("bat", "tab", "tap", "pat", "apt");
//
//        // 26. Group numbers by remainder when divided by 3
//        List<Integer> nums11 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        System.out.println(nums11.stream().map(i -> i % 3).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
//
//        // 27. Find duplicate characters in string
//        String str3 = "programming";
//
//        // 28. Calculate average salary by department
//        List<Employee> employees2 = Arrays.asList(
//                new Employee("A", "Admin", 40000),
//                new Employee("B", "Admin", 50000),
//                new Employee("C", "Dev", 60000)
//        );
//        System.out.println(employees2.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary))));
////        employees2.stream().map(a->a.getDepartment()).mapToInt().average().ifPresent(e -> System.out.println(e));
//
//        // 29. Sort by multiple fields (name, then salary)
//        List<Employee> employees3 = Arrays.asList(
//                new Employee("John", "Dev", 60000),
//                new Employee("John", "Dev", 50000),
//                new Employee("Alice", "QA", 55000)
//        );
//
//        // 30. Custom collector: Join even numbers with ‘-’
//        List<Integer> nums12 = Arrays.asList(2, 4, 6, 8, 10);

    }

    static class Employee {
        String name;
        String department;
        int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
// getters/setters can be added if needed
@Override
public String toString() {
    return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
}
    }
}
