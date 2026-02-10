import java.util.Scanner;
public class SplitCompare {
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

    static String[] splitWords(String s) {
        int len = findLength(s);
        int spaces = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                spaces++;
        }

        int[] index = new int[spaces + 2];
        int k = 0;
        index[k++] = -1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                index[k++] = i;
        }
        index[k] = len;

        String[] words = new String[spaces + 1];

        for (int i = 0; i < words.length; i++) {
            String w = "";
            for (int j = index[i] + 1; j < index[i + 1]; j++) {
                w = w + s.charAt(j);
            }
            words[i] = w;
        }
        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static voi
