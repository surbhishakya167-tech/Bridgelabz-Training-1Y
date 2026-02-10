import java.util.Scanner;
public class LowercaseCompare{
    static String toLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                result = result + (char)(ch + 32);
            else
                result = result + ch;
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

        String s1 = toLower(text);
        String s2 = text.toLowerCase();

        boolean result = compare(s1, s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);

        sc.close();
    }
}
