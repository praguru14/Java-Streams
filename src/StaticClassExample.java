public class StaticClassExample {
    static class ex{
       static int b = 9;
    }
    public static int a = 2;

    static{
         a = 1;
    }
//    int b = 2;
    public static void main(String[] args) {
        System.out.println(StaticClassExample.ex.b);
    }
}
