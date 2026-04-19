package org.example;

import java.util.regex.*;

public class UsernameValidator {

    public static void main(String[] args) {

        String[] usernames = {"user_123", "123user", "us"};

        for (String username : usernames) {
            if (isValid(username)) {
                System.out.println(username + " -> Valid");
            } else {
                System.out.println(username + " -> Invalid");
            }
        }
    }
    public static boolean isValid(String username) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }
}