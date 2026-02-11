import java.util.Scanner;
public class FactorialRecursion {

    static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static void displayResult(long result) {
        System.out.println("Factorial: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = takeInput(sc);
        long result = factorial(num);
        displayResult(result);
    }
}
