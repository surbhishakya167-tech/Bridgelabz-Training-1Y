package com.access.two;

import com.access.one.Base;

public class Derived extends Base {

    public static void main(String[] args) {

        Derived d = new Derived();

        d.publicMethod();
        d.protectedMethod();

        System.out.println("Default and Private methods are not accessible here.");

    }
}