public static boolean isPalindrome(String str) {
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    if(sb.toString().equals(str)) {
        return true;
    }
    return false;
}

public static void main(String[] args) {
    String input = "madam";
    boolean result = isPalindrome(input);
    System.out.println("Is palindrome: " + result); // Expected Output: true
}
