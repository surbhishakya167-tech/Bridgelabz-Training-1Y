import java.util.Scanner;
public class TemperatureConverter{

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Converted Temperature: " + celsiusToFahrenheit(temp));
        } else if (choice == 2) {
            System.out.println("Converted Temperature: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
