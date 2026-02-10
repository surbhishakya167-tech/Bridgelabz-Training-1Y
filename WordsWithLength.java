import java.util.Scanner;
public class WordsWithLength {
    static String[] splitWords(String s) {
        int spaces = 0;
        for (int i = 0; ; i++) {
            try {
                if (s.charAt(i) == ' ')
                    spaces++;
            } catch (RuntimeException e) {
                break;
            }
        }

        String[] words = new String[spaces + 1];
        int index = 0;
        String temp = "";

        for (int i = 0; ; i++) {
            try {
                char ch = s.charAt(i);
                if (ch == ' ') {
                    words[index++] = temp;
                    temp = "";
                } else {
                    temp = temp + ch;
                }
            } catch (RuntimeException e) {
                words[index] = temp;
                break;
            }
        }
        return words;
    }

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

    static String[][] make2D(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = make2D(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }

        sc.close();
    }
}
