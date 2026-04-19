package org.example;

import java.util.regex.*;

public class IPAddressValidator {

    public static void main(String[] args) {

        String[] ips = {"192.168.1.1", "256.100.50.0", "10.0.0.1"};

        for (String ip : ips) {
            if (isValid(ip)) {
                System.out.println(ip + " -> Valid");
            } else {
                System.out.println(ip + " -> Invalid");
            }
        }
    }

    public static boolean isValid(String ip) {
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        return Pattern.matches(regex, ip);
    }
}