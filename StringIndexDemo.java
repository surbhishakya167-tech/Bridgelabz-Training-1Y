import java.util.Scanner;
public class StringIndexDemo{
    static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }
    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            handleException(text);
        }

        sc.close();
    }
}
