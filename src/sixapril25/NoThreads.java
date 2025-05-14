package sixapril25;

public class NoThreads {
    public static void main(String[] args) {
        printNumbers();   // long task
        printLetters();   // won't start until numbers finish
    }

    static void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            sleep();
        }
    }

    static void printLetters() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            sleep();
        }
    }

    static void sleep() {
        try { Thread.sleep(500); } catch (InterruptedException e) {}
    }
}
