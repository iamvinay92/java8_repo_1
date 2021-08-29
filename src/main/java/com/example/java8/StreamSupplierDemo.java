package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class StreamSupplierDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "something is wrong"));
    }
}
