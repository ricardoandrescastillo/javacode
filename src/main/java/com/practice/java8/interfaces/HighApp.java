package com.practice.java8.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {

    List<String> list = new ArrayList<>();

    public HighApp() {
        list.add("Ricardo");
        list.add("Andres");
        list.add("Carmen");
        list.add("Juan");
    }

    private Function<Integer, String> filtering = new Function<Integer, String>() {
        @Override
        public String apply(Integer integer) {
            if (integer > 10) {
                return "The number is greater than 10";
            } else {
                return "The number is less than 10";
            }
        }
    };
    private Function <String , String> toUpperCase = val -> val.toUpperCase();
    private Function <String , String> toLowerCase = val -> val.toLowerCase();

    BiFunction<Product, Integer, Double> totalPriceCalculator = (product, quantity) -> product.getPrice() * quantity;

    public void filter(){
        System.out.println(filtering.apply(10));
    }
    public void print(Function<String, String> func, String value) {
        System.out.println(func.apply(value));
    }
    public double calculatePrice (int quantity) {
        return totalPriceCalculator.apply(new Product("Shoes",50.0), quantity);
    }

    private Predicate<Integer> isEven = val -> val % 2 ==0;

   /* private Predicate<String> withR = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.contains("R");
        }
    };*/
    public Predicate<String> withR (String par) {
        return s -> s.contains(par);
    }
    public void predicate(String par) {
        list.stream()
                .filter(withR(par))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        HighApp app = new HighApp();
        app.print(app.toUpperCase, "Ricardo");
        app.print(app.toLowerCase, "Ricardo");
        System.out.println("Price " + app.calculatePrice(5));
        app.filter();
        app.predicate("R");
    }

    private class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}


