package com.example.java8.Optional;

import com.example.java8.Emp;
import java.util.Arrays;
import java.util.Optional;

/*
* Optional is introduced to handle NPE exceptions in code. Object may contain value or could be null.
* performing operation on null would leads to NPE.
*
*
* METHODS:
* empty
* of
* ofNUllable
*
* */

public class OptionalTest {
    public static void main(String[] args) {
        Emp emp = new Emp(1,null, 10000L, Arrays.asList("123","456"));

        String name = emp.getName();
//        System.out.println(" name is "+ name.toLowerCase());

         //

        Optional<Integer> name1 = Optional.ofNullable(emp.getId());
        System.out.println(" optional res is "+ name1);

    }
}
