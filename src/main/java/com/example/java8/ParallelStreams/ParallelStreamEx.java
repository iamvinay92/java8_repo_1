package com.example.java8.ParallelStreams;

/*
 * - Parallel stream means utilizing different cores of computer
 *
 * - In normal stream/ java code, operation is done on a single core of cpu whereaas in parallel stream, tasks are divided
 *   into different cores of the processor and final result is combination of outcome of every parallel task
 *
 * - However, the order of execution is not under the control in this.
 * */

import java.util.stream.IntStream;

public class ParallelStreamEx {

    public static void main(String[] args) {

    /*    long start = 0;
        long end =0;

        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("normal  stream took this much of time: "+ (end-start));

        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("parallel  stream took this much of time: "+ (end-start));*/


        IntStream.range(1, 10).forEach((e) ->
                System.out.println("val is "+e+ " : normal thread name is " + Thread.currentThread()));

        IntStream.range(1, 10).parallel().forEach((e) ->
                System.out.println("val is "+e + " :parallel thread name is " + Thread.currentThread()));

    }
}