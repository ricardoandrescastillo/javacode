package com.practice.java15;

public abstract sealed class Shape permits Circle, Square {

    public void print(){
        System.out.println("Shape");
    }
}
