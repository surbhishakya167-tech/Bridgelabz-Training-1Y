import java.util.Scanner;
public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine();
    }

    static int[] updateRange(int low, int high, int guess, String feedback) {
        if (feedback.equalsIgnoreCase("high")) {
            high = guess - 1;
        } else if (feedback.equalsIgnoreCase("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);
            feedback = getFeedback(sc);
            int[] range = updateRange(low, high, guess, feedback);
            low = range[0];
            high = range[1];
        }

        System.out.println("Computer guessed your number!");
    }
}
