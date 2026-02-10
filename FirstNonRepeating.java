import java.util.Scanner;
public class FirstNonRepeating {
    static char firstNonRepeat(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '#';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char result = firstNonRepeat(text);

        if (result == '#')
            System.out.println("No non-repeating character");
        else
            System.out.println(result);

        sc.close();
    }
}
