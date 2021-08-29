package com.example.java8;

import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * Supplier is a F.I. which accepts NO input param object and but returns the result.
 *
 * Application: a list of items and found nothing then we can use SUpplier FI to show error msg
 * */

public class SupplierDemo{

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "something is wrong ";

        System.out.println(" output is:  "+ supplier.get());

    }
}
