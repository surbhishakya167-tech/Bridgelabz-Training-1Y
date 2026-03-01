import java.util.function.Function;

public class StringLengthApp {

    public static void main(String[] args) {

        int limit = 20;

        Function<String, Integer> lengthFunction = text -> text.length();

        String message = "Functional Interface Example";

        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit.");
        } else {
            System.out.println("Message is within limit.");
        }
    }
}