package com.practice.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomExample {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();
        System.out.println(generator.nextInt());
    }
}
