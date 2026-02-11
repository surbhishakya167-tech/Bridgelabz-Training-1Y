import java.util.Scanner;
public class BasicCalculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Result: " + add(num1, num2));
        } else if (choice == 2) {
            System.out.println("Result: " + subtract(num1, num2));
        } else if (choice == 3) {
            System.out.println("Result: " + multiply(num1, num2));
        } else if (choice == 4) {
            if (num2 != 0)
                System.out.println("Result: " + divide(num1, num2));
            else
                System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Invalid choice");
        }
    }
}
