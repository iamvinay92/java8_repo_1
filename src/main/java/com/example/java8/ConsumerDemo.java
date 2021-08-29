package com.example.java8;

import java.util.function.Consumer;

/*
* Consumer is a F.I. which accepts the single input param object and
* perform operation on it without returning anything
* */

public class ConsumerDemo  {

    public static void main(String[] args) {

       Consumer<Integer> consumer = (val) -> {
           System.out.println("val is "+ val);
       };

       consumer.accept(22);
    }
}
