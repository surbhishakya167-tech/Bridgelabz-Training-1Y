import java.util.Scanner;
public class CharFrequency {
    static String[][] frequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        String[][] data = new String[count][2];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] != -1) {
                data[k][0] = String.valueOf(ch);
                data[k][1] = String.valueOf(freq[ch]);
                k++;
                freq[ch] = -1;
            }
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
