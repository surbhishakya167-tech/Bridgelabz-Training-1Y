import java.util.Scanner;
public class TrimUsingCharAt {
    static int[] findTrimPoints(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ')
            start++;

        while (end >= start && s.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    static String makeSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + s.charAt(i);
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] points = findTrimPoints(text);
        String s1 = makeSubstring(text, points[0], points[1]);
        String s2 = text.trim();

        boolean result = compare(s1, s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);

        sc.close();
    }
}
