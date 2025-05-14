import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main(String[] args) {

        // 1️⃣ Remove duplicates from the List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5);

        // 2️⃣ Find the second-highest number in the List
        List<Integer> nums = Arrays.asList(10, 20, 5, 40, 30);

        // 3️⃣ Filter elements starting with 'A' from the List
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        System.out.println(words.stream().filter(i->i.startsWith("A")).collect(Collectors.toList()));

        // 4️⃣ Convert List of Strings to List of Integers (string lengths)
        List<String> stringList = Arrays.asList("Java", "Spring", "Angular");
        System.out.println(stringList.stream().map(String::length).collect(Collectors.toList()));

        // 5️⃣ Find all even numbers in the List
        List<Integer> evenNumbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // 6️⃣ Find the sum of all elements in the List
        List<Integer> sumList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumList.stream().reduce(0, Integer::sum));

        // 7️⃣ Sort the List in reverse order
        List<Integer> sortList = Arrays.asList(10, 5, 8, 30, 15);
        System.out.println(sortList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
