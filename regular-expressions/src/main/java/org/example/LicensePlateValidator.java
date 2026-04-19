package org.example;

import java.util.regex.*;

public class LicensePlateValidator {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345", "XY9876"};

        for (String plate : plates) {
            if (isValid(plate)) {
                System.out.println(plate + " -> Valid");
            } else {
                System.out.println(plate + " -> Invalid");
            }
        }
    }
    public static boolean isValid(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return Pattern.matches(regex, plate);
    }
}