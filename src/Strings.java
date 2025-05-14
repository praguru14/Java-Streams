import java.util.stream.IntStream;

public class Strings {

    public static void main(String[] args) {

        String s1 = "prafull";

//        IntStream distinct = s1.chars().distinct().forEach(cg -> System.out.println((char)cg));

        Boolean count = s1.contains("l");
        int a1 = 0;
        for(int i =0;i<s1.length();i++){
            if(s1.contains("l")){
                a1++;
            }
        }

        System.out.println(a1);

        String a = "";
        char[] c = s1.toCharArray();
        for(int i = s1.length()-1;i>=0;i--){


        a+=c[i];
        }
        System.out.println(a);

        if(a.equals(s1)){
            System.out.println("same");
        }






    }
}
