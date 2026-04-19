package org.example;

import java.util.regex.*;
public class HexColorValidator {
    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123"};
        for (String color : colors) {
            if (isValid(color)) {
                System.out.println(color + " -> Valid");
            } else {
                System.out.println(color + " -> Invalid");
            }
        }
    }
    public static boolean isValid(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return Pattern.matches(regex, color);
    }
}