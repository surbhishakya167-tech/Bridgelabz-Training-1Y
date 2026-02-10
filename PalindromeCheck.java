import java.util.Scanner;
public class PalindromeCheck {
    static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean checkPalindromeRec(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return checkPalindromeRec(s, start + 1, end - 1);
    }

    static char[] reverseArray(String s) {
        char[] rev = new char[s.length()];
        int k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev[k++] = s.charAt(i);
        }
        return rev;
    }

    static boolean checkPalindromeArray(String s) {
        char[] arr = s.toCharArray();
        char[] rev = reverseArray(s);

        if (arr.length != rev.length)
            return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        boolean r1 = checkPalindrome(text);
        boolean r2 = checkPalindromeRec(text, 0, text.length() - 1);
        boolean r3 = checkPalindromeArray(text);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        sc.close();
    }
}
