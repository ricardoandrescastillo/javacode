package com.practice.java9;

import java.util.Optional;

public class OptionalIfIsPresent {

    public void optionalIfIsPresent(){
        Optional<String> optional = Optional.empty();

        optional.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Value is absent")
        );

        String result = optional.or(() -> Optional.of("Default")).get();
        System.out.println(result);

        optional.stream().forEach(System.out::println);
    }

    public static void main (String ... args){
        OptionalIfIsPresent optionalIfIsPresent = new OptionalIfIsPresent();
        optionalIfIsPresent.optionalIfIsPresent();
    }
}
