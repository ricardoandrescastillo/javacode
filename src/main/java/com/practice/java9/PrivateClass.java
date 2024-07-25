package com.practice.java9;

import com.practice.java9.interfaces.InterfacePrivate;

public class PrivateClass implements InterfacePrivate {


    public static void main (String... args) {

        InterfacePrivate privateClass = new PrivateClass();
        privateClass.defaultMethod1("method1");
        privateClass.defaultMethod1("method2");
    }
}
