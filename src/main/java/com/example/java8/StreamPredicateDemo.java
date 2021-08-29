package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPredicateDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,5,6,4);
        list.stream().filter( val -> val%2 ==0).forEach(val -> System.out.println("val is "+ val));

    }
}
