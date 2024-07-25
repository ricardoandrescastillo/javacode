package com.practice.java8.interfaces;

public interface IDefaultMethodInterface {

    default void show() {
        System.out.println("Default Method");
    }
}
