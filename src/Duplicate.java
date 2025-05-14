//import java.util.HashMap;
//import java.util.Map;
//
//public static void findDuplicateCharacters(String str) {
//    // Your logic here
//    HashMap<Character, Integer> map = new HashMap<>();
//    StringBuilder sb = new StringBuilder();
//
//    for(char str1:str.toCharArray()){
//        map.put(str1,map.getOrDefault(str1,0)+1);
//    }
////    System.out.println(map);
//    for(Map.Entry<Character,Integer> entry :map.entrySet()){
//        if(entry.getValue()>1){
//            sb.append(entry.getKey());
//            sb.append(" ");
//        }
//    }
//    System.out.println(sb);
//
//}
//
//public static void main(String[] args) {
//    String input = "programming";
//    findDuplicateCharacters(input); // Expected Output: "r", "g", "m"
//}
