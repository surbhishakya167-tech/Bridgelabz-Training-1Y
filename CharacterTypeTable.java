import java.util.Scanner;
public class CharacterTypeTable 
    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyze(String s) {
        String[][] data = new String[s.length()][2];

        for (int i = 0; i < s.length(); i++) {
            data[i][0] = String.valueOf(s.charAt(i));
            data[i][1] = checkChar(s.charAt(i));
        }
        return data;
    }

    static void display(String[][] data) {
        System.out.println("Char\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = analyze(text);
        display(result);

        sc.close();
    }
}
