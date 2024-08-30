package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApp {

    private List<String> list;
    private List<String> numbers;

    public StreamsApp() {
        list = new ArrayList<>();
        list.add("Ricardo");
        list.add("Andres");
        list.add("Juan");
        list.add("Fernando");

        //complete the list of numbers
        numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
    }

    public List<String> filter() {
        System.out.println("Filter");

        return list.stream()
                .filter(name -> name.startsWith("R") || name.startsWith("J"))
                .collect(Collectors.toList());
    }

    public void sort() {
        System.out.println("Sort");
        list.stream().sorted((name1, name2) -> name2.compareTo(name1)).forEach(System.out::println);
    }

    public List<Integer> transform() {
        System.out.println("Transform");
        return numbers.stream().map(number -> Integer.parseInt(number) + 1).collect(Collectors.toList());
    }

    public void limit() {
        System.out.println("Limit");
        list.stream().limit(2).forEach(System.out::println);
    }

    public void count() {
        System.out.println("Count");
        long x = list.stream().count();
        System.out.println(x);
    }

    public List<String> mix() {
        System.out.println("Mix");
        return list.stream()
                .filter(name -> name.startsWith("R") || name.startsWith("J"))
                .map(name -> name.toUpperCase())
                .map(name -> name.concat(" - "))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public void flatMap() {


    List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("A", "B", "C"),
            Arrays.asList("D", "E", "F"),
            Arrays.asList("G", "H", "I")
    );

    List<String> flattenedList = listOfLists.stream()
            .flatMap(List::stream)  // Flatten the stream of lists into a stream of strings
            .collect(Collectors.toList());

        System.out.println(flattenedList);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        app.filter().forEach(System.out::println);
        app.sort();
        app.transform().forEach(System.out::println);
        app.limit();
        app.count();
        app.mix().forEach(System.out::println);
        app.flatMap();
    }
}
