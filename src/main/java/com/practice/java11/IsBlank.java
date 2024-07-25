package com.practice.java11;

public class IsBlank {

    public static void isBlankMethod() {
        System.out.println(" ".isBlank()); // true

        String multiline = "This is\n a multiline\n string.";
        multiline.lines().forEach(System.out::println);

        System.out.println("  hello  ".strip()); // "hello"
        System.out.println("  hello  ".stripLeading()); // "hello  "
        System.out.println("  hello  ".stripTrailing()); // "  hello"

        System.out.println("hello".repeat(3)); // "hellohellohello"
    }

    public static void main (String ... args) {
        isBlankMethod();
    }
}

