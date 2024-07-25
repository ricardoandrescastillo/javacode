package com.practice.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapApp {

    private Map<Integer, String> map;

    public  MapApp() {
        map = new HashMap<>();
        map.put(1, "Ricardo");
        map.put(2, "Andres");
        map.put(3, "Jaime");
        map.put(4, "Carmen");
    }

    public void print_v7() {
        System.out.println("print_v7");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Val: " + e.getValue());
        }
    }

    public void print_v8() {
        System.out.println("print_v8");
        map.forEach((k, v) -> System.out.println("Key: " + k + " Val: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void collect () {
        System.out.println("collect");
        Map <Integer, String> collect = map.entrySet().stream()
                .filter(val -> val.getValue().contains("o"))
                .collect(Collectors.toMap(nmap -> nmap.getKey(), nmap -> nmap.getValue()));
        collect.entrySet().stream().forEach(System.out::println);
    }

    public void putIfAbsent() {
        System.out.println("putIfAbsent");
        map.putIfAbsent(5,"Carmen");
        map.entrySet().stream().forEach(System.out::println);
    }

    public void computeIfPresent() {
        System.out.println("computeIfPresent");
        map.computeIfPresent(3,(k,v) -> "my value");
        map.entrySet().stream().forEach(System.out::println);
    }

    public void getOrDefault() {
        System.out.println("getOrDefault");
        String value = map.getOrDefault(7, "default");
        System.out.println(value);
    }

    public static void main(String[] args) {
        MapApp app = new MapApp();
        app.print_v7();
        app.print_v8();
        app.collect();
        app.putIfAbsent();
        app.computeIfPresent();
        app.getOrDefault();
    }
}
