package com.example.java8.MapAndReduce;

/*
 * MAP - transforming the data
 *
 *  REDUCE - Aggregating the data -> combines the stream of elements and produces single value
 *  ex: T reduce(T identity, BinaryOperator<T> accumulator)
 *   identity: its a initial value of type T
 *   accumulator is a function to combine the two values
 *
 * */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> allNumbers = allNUmbers();

        // Perform operation to sum all
        // 1st way,
        int sum = 0;
        for (int i : allNumbers) {
            sum = sum + i;
        }
        System.out.println(sum);

        // 2nd way using map,
        int sum1 = allNumbers.stream().mapToInt(e -> e).sum();
        System.out.println(sum1);

        // 3rd way using map,
        int sum2 = allNumbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum2);

        // Example: find max from a given stream of integers
        int max = allNumbers.stream().reduce((a,b) -> a>b?a:b).get();
        System.out.println(max);

    }

    public static List<Integer> allNUmbers() {
        return Stream.of(2, 5, 17, 9, 1, 4).collect(Collectors.toList());
    }
}
