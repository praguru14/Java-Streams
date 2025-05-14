import java.util.*;
import java.util.stream.Collectors;

public class MapQuestions {
    public static void main(String[] args) {

        // 8️⃣ Sort a Map by values using Streams
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("A", 10);
        unsortedMap.put("B", 5);
        unsortedMap.put("C", 20);
        unsortedMap.put("D", 15);

        // 9️⃣ Flatten all values from a Map<String, List<Integer>> into a single List
        Map<String, List<Integer>> nestedMap = new HashMap<>();
        nestedMap.put("A", Arrays.asList(1, 2, 3));
        nestedMap.put("B", Arrays.asList(4, 5));
        nestedMap.put("C", Arrays.asList(6, 7, 8));

        // 🔟 Convert Map<String, Integer> to List<String> where values > 10
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 15);
        fruitMap.put("Mango", 8);
        fruitMap.put("Banana", 20);
        fruitMap.put("Grapes", 5);

        // 1️⃣1️⃣ Merge two Maps where duplicate keys' values are summed up
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 30);
        map2.put("C", 40);
    }
}
