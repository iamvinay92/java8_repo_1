package com.example.java8;

import java.util.function.Predicate;

/*
 * Predicate is a F.I. which accepts the input param object and returns the result in true/false
 *
 * This F.I. is used for conditional checks
 *
 * */

public class PredicateDemo{

    public static void main(String[] args) {
        Predicate<Integer> predicate = (value) -> { return value %2 == 0; };

        System.out.println("val is "+ predicate.test(2));

    }
}
