package com.practice.java11;
import java.util.List;
import java.util.stream.Collectors;

public class Var {

    public static void main (String ... args) {
        varExample();
    }

    private static void varExample() {
        var list = List.of("one", "two", "three");
        list.forEach((var item) -> System.out.println(item));
    }

}
