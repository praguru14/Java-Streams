package sixapril25;

import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;

class test {

    // 🟢 Easy

    public List<Integer> getEvenNumbers(List<Integer> numbers) {
//        System.out.println(nums1.stream().filter(i -> i % 2 == 0).toList());
        Map<Integer, Long> collect = nums1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        collect.entrySet().stream().
        return null; }

    List<Integer> nums1 = List.of(0,1,2,2,4,4,1);

    public List<String> convertToUpper(List<String> names) {
        names.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        return null; }
    List<String> names1 = List.of("alice", "bob", "charlie");

    public long countGreaterThanFifty(List<Integer> numbers) { return 0; }
    List<Integer> nums2 = List.of(10, 60, 45, 80, 12);

    public List<String> sortDescending(List<String> items) {
//        items.sort(Comparator.reverseOrder());
        System.out.println(items.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        return null; }


    public int sumDistinct(List<Integer> nums) {
        System.out.println(nums.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting())));
        return 0; }
    List<Integer> nums3 = List.of(1, 2, 2, 3, 4, 4);

    // 🟡 Medium


    public List<String> highEarners(List<Employee> employees) {
        System.out.println(employees.stream().filter(emp -> emp.salary() > 50000).map(e->e.name()).collect(Collectors.toList()));
        return null; }

    public Map<Integer, List<String>> groupByLength(List<String> words) {
        System.out.println(words.stream().collect(Collectors.groupingBy(c -> c.length())));
        return null; }


    record Product(String name, double price) {}
    public Optional<Product> getMostExpensive(List<Product> products) { return null; }
    List<Product> products = List.of(
            new Product("Pen", 1.2),
            new Product("Laptop", 1500),
            new Product("Book", 20)
    );

    record Order(String id, String customerId, double amount) {}
    public Map<String, List<Order>> groupByCustomer(List<Order> orders) {
        System.out.println(orders.stream().collect(Collectors.groupingBy(c -> c.customerId)));
        return null; }


    public Optional<Integer> secondHighest(List<Integer> numbers) { return null; }
    List<Integer> nums4 = List.of(10, 30, 40, 20, 50);

    // 🔴 Hard

    record Transaction(String id, YearMonth month, double amount) {}
    public Map<YearMonth, Double> sumPerMonth(List<Transaction> txns) {
        txns.stream().collect(Collectors.groupingBy(Transaction::month, Collectors.summingDouble(Transaction::amount)));
        return null; }
    List<Transaction> txns = List.of(
            new Transaction("t1", YearMonth.of(2024, 1), 100),
            new Transaction("t2", YearMonth.of(2024, 1), 200),
            new Transaction("t3", YearMonth.of(2024, 2), 300)
    );

    public Map<Character, Long> charFrequency(List<String> words) { return null; }
    List<String> words2 = List.of("apple", "banana");

    public List<Integer> flattenAndSort(List<List<Integer>> data) { return null; }
    List<List<Integer>> data = List.of(
            List.of(3, 2, 1),
            List.of(4, 2),
            List.of(5, 1)
    );

    record Department(String name, List<Employee> employees) {}
    public List<String> getAllEmployeeNames(List<Department> departments) { return null; }
    List<Department> departments = List.of(
            new Department("HR", List.of(new Employee("Alice", 0), new Employee("Bob", 0))),
            new Department("IT", List.of(new Employee("Carol", 0)))
    );

    record Person(String name, int age, String city) {}
    public Map<String, Double> avgAgeByCity(List<Person> people) {
    people.stream().collect(Collectors.groupingBy(Person::city, Collectors.averagingInt(Person::age)));
        return null; }
    List<Person> people = List.of(
            new Person("A", 30, "Delhi"),
            new Person("B", 25, "Delhi"),
            new Person("C", 40, "Mumbai")
    );

    public static void main(String[] args) {
        test sp = new test();
        List<Integer> nums1 = List.of(1, 2, 3, 4, 5, 6);
        sp.getEvenNumbers(nums1);
        List<String> items1 = List.of("banana", "apple", "mango");
        sp.sortDescending(items1);
        List<Integer> nums3 = List.of(1, 2, 2, 3, 4, 4);
        sp.sumDistinct(nums3);
        List<Employee> employees = List.of(
                new Employee("John", 45000),
                new Employee("Alice", 60000),
                new Employee("Bob", 70000)
        );

        sp.highEarners(employees);
        List<String> words1 = List.of("a", "bb", "ccc", "dd");
        sp.groupByLength(words1);
        List<Order> orders = List.of(
                new Order("o1", "c1", 200),
                new Order("o2", "c2", 500),
                new Order("o3", "c1", 300)
        );
        sp.groupByCustomer(orders);
        // Call methods here manually to test after implementing
    }
}
 class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String name() {
        return name;
    }

    public double salary() {
        return salary;
    }

//    @Override
//    public boolean equals(Object o) {
//        // equals method automatically implemented
//    }
//
//    @Override
//    public int hashCode() {
//        // hashCode method automatically implemented
//    }

    @Override
    public String toString() {
        // toString method automatically implemented
        return "Employee[name=" + name + ", salary=" + salary + "]";
    }
}
