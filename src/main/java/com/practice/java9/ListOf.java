package com.practice.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListOf {

        List<String> list = List.of("Ricardo","Andres","Juan");
        Set<String>  set = Set.of("a","b");
        Map<String, String> map = Map.of("k1","value1","k2","value2");

        public static void main(String ... args){
            ListOf listOf = new ListOf();
            listOf.list.forEach(System.out::println);
            listOf.set.forEach(System.out::println);
            listOf.map.entrySet().forEach(System.out::println);
        }
}
