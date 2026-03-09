package com.access.one;

public class Base {

    public void publicMethod() {
        System.out.println("Public method accessible everywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessible in subclass");
    }

    void defaultMethod() {
        System.out.println("Default method accessible only in same package");
    }

    private void privateMethod() {
        System.out.println("Private method accessible only in same class");
    }

    public void callPrivate() {
        privateMethod();
    }
}