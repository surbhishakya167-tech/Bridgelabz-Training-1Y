import java.util.Scanner;
public class VowelConsonantCount {
    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "NotLetter";
    }

    static int[] countVC(String s) {
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            String result = checkChar(s.charAt(i));
            if (result.equals("Vowel"))
                v++;
            else if (result.equals("Consonant"))
                c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] result = countVC(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
