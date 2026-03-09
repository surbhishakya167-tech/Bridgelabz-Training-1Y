package com.bank.main;

import com.bank.util.*;

public class MainApp {

    public static void main(String[] args) {

        InterestCalculator ic = new InterestCalculator();

        double P = 10000;
        double R = 5;
        double T = 2;

        double si = ic.calculateSimpleInterest(P, R, T);
        double ci = ic.calculateCompoundInterest(P, R, T);

        System.out.println("Principal: " + P);
        System.out.println("Rate: " + R);
        System.out.println("Time: " + T);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);

    }
}