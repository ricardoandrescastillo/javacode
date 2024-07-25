package com.practice.java8;

import com.practice.java8.interfaces.IDefaultMethodInterface;
import com.practice.java8.interfaces.IDefaultMethodInterface2;

public class DefautlMethod implements IDefaultMethodInterface, IDefaultMethodInterface2 {

    @Override
    public void show() {
       IDefaultMethodInterface2.super.show();
    }

public static void main(String[] args) {
       IDefaultMethodInterface defaultMethod = new DefautlMethod();
       defaultMethod.show();
    }
}
