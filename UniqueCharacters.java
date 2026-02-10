import java.util.Scanner;
public class UniqueCharacters {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
        }
        return count;
    }

    static char[] uniqueChars(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (ch == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[k++] = ch;
            }
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] result = uniqueChars(text);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
