package com.practice.java10;
import java.util.List;
import java.util.stream.Collectors;

public class Var {

    public static void main (String ... args) {
        varFilter();
        varExample();

    }

    private static void varExample() {
        var list = List.of("one","two","three");
        list.forEach(System.out::println);
        list.add("juan");// runtime error this is immutable
    }

    private static void varFilter() {
        var numbers = List.of(1, 2, 3, 4, 5);

        for (var number : numbers) {
            System.out.println(number);
        }
        var filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("even");
        filteredNumbers.forEach(System.out::println);
    }
}
