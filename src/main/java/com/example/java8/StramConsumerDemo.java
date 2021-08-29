package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StramConsumerDemo {
    public static void main(String[] args) {

        Consumer<Integer> consumer = val -> System.out.println("val is " + val);
        consumer.accept(22);

        List<Integer> list = Arrays.asList(2, 4, 5, 6, 4);
        list.stream().forEach(val -> System.out.println(" ele is " + val));
    }
}
