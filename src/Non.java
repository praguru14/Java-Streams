import java.util.HashMap;
import java.util.Map;

public static char firstNonRepeatingChar(String str) {

    HashMap<Character,Integer> hs = new HashMap<>();
    for(char s:str.toCharArray()){
        hs.put(s,hs.getOrDefault(s,0)+1);
    }
    for(Map.Entry<Character,Integer> e:hs.entrySet()){
        if(e.getValue()==1){
            return e.getKey();
        }
    }

    // Your logic here
    return '\0';
}

public static void main(String[] args) {
    String input = "swiss";
    char result = firstNonRepeatingChar(input);
    System.out.println("First non-repeating character: " + result); // Expected Output: "w"
}