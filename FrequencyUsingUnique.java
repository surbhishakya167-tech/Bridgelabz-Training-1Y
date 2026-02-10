import java.util.Scanner;
public class FrequencyUsingUnique {
    static char[] uniqueCharacters(String s) {
        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
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

    static String[][] frequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(s);
        String[][] data = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            data[i][0] = String.valueOf(unique[i]);
            data[i][1] = String.valueOf(freq[unique[i]]);
        }
        return data;
    }

    static void display(String[][] data) {
        System.out.println("Char\tFreq");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = frequency(text);
        display(result);

        sc.close();
    }
}
