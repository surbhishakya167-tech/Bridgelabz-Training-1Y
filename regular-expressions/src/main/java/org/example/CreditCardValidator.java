package org.example;
import java.util.regex.*;

public class CreditCardValidator {

    public static void main(String[] args) {

        String[] cards = {
                "4123456789012345",
                "5123456789012345",
                "6123456789012345",
                "423456789012345"
        };

        for (String card : cards) {
            if (isValid(card)) {
                System.out.println(card + " -> Valid");
            } else {
                System.out.println(card + " -> Invalid");
            }
        }
    }

    public static boolean isValid(String card) {
        String regex = "^(4\\d{15}|5\\d{15})$";
        return Pattern.matches(regex, card);
    }
}