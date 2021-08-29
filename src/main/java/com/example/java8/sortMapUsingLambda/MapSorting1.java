package com.example.java8.sortMapUsingLambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapSorting1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(3,"abc");
        map.put(1, "xyz");
        map.put(5,"cde");

        Stream<Map.Entry<Integer, String>> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        result.forEach(System.out::println);
    }
}
