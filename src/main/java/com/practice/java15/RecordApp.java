package com.practice.java15;


public class RecordApp {
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person.name());
        System.out.println(person.age());
    }

}
