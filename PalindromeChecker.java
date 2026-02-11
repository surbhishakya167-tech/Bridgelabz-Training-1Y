import java.util.Scanner;
public class PalindromeChecker{

    static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static void displayResult(boolean result) {
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(result);
    }
}
