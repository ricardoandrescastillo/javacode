package com.practice.java8;

import java.util.Optional;

public class OptionalApp {

    public void test() {
        try {
            System.out.println("test");
            Optional optional = Optional.empty();
            optional.get();
        } catch(Exception e) {
            System.out.println("No element");
        }
    }

    public void orElse (String value) {
        System.out.println("orElse");
        String data  = Optional.of(Optional.ofNullable(value).orElse("Default")).get();
        System.out.println(data);
    }

    public void orElseThrow (String value) {
        System.out.println("orElseThrow");
        Optional<String> optional = Optional.ofNullable(value);
        optional.orElseThrow(NullPointerException::new);
        System.out.println(optional.get());
    }
    public void isPresent( String value ) {
        System.out.println("isPresent");
        Optional<String> optional = Optional.ofNullable(value);
        System.out.println(optional.isPresent());
    }

    public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
        app.test();
        app.orElse("Hi");
        app.orElse(null);
        //app.orElseThrow(null);
        app.orElseThrow("null");
        app.isPresent("Hi");
    }
}
