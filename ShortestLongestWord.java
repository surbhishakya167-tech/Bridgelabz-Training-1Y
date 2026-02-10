import java.util.Scanner;
public class ShortestLongestWord {
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
        String temp = "";
        int k = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = s.charAt(i);
                if (ch == ' ') {
                    words[k++] = temp;
                    temp = "";
                } else {
                    temp = temp + ch;
                }
            } catch (RuntimeException e) {
                words[k] = temp;
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

    static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = make2D(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest word: " + data[result[0]][0]);
        System.out.println("Longest word: " + data[result[1]][0]);

        sc.close();
    }
}
