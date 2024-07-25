package com.practice.java9.interfaces;

public interface InterfacePrivate {

    default void defaultMethod1(String method) {
        privateMethod(method);
    }

    default void defaultMethod2(String method) {
        privateMethod(method);
    }

    private void privateMethod (String method ) {
        System.out.println("private " + method);
    }
}
