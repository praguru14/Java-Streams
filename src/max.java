import java.util.HashMap;
import java.util.Map;

public static char getMaxOccurringChar(String str) {
    // Your logic here
    HashMap<Character,Integer> hs = new HashMap<>();
    for(char c : str.toCharArray())
        hs.put(c, hs.getOrDefault(c,0) + 1);
    System.out.println(hs);
    Integer maxCount=0;
    char maxChar = 0;
    for(Map.Entry<Character,Integer> entry : hs.entrySet()){

        if(entry.getValue() > maxCount){
            maxChar = entry.getKey();
            maxCount = entry.getValue();
        }
    }
    return maxChar;
}

public static void main(String[] args) {
    String input = "success";
    char result = getMaxOccurringChar(input);
    System.out.println("Max occurring character: " + result); // Expected Output: "s"
}
