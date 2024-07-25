package com.practice.java18;

public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Object obj = 123;
        String result = switch (obj) {
            case String s -> "String: " + s.toUpperCase();
            case Integer i -> "Integer: " + (i * 2);
            default -> "Unknown type";
        };
        System.out.println(result); // Output: Integer: 246
    }
}
