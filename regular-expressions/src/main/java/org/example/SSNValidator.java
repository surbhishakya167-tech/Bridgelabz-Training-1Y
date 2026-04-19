package org.example;
import java.util.regex.*;

public class SSNValidator {

    public static void main(String[] args) {

        String[] inputs = {
                "123-45-6789",
                "123456789"
        };

        for (String ssn : inputs) {
            if (isValid(ssn)) {
                System.out.println(ssn + " -> Valid");
            } else {
                System.out.println(ssn + " -> Invalid");
            }
        }
    }

    public static boolean isValid(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return Pattern.matches(regex, ssn);
    }
}

