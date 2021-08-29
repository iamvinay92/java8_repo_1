package com.example.java8.Optional;


import com.example.java8.Emp;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;


/* Optional orElse() -
 * This method can be used to return other values in case of null.
 * It is really helpful in providing default values to variables.
 * */

public class OptionalOrElse {

    public static void main(String[] args) {

        /*
        * If value is null then return some default value to avoid NPE
        * */
        Emp emp = new Emp(1,null, 10000L, Arrays.asList("123","456"));
        String name = Optional.ofNullable(emp.getName()).orElse("vinay");
        System.out.println("res is "+ name);


        /*
         * If value is null then thow custom exception
         * */
        Emp emp1 = new Emp(4,null, 10000L, Arrays.asList("123","456"));
        String newName = Optional.ofNullable(emp1.getName()).orElseThrow( () -> new ArithmeticException("test"));
//        String newName = Optional.ofNullable(emp1.getName()).orElseGet(() -> "test3232");

        System.out.println("new res is "+ newName);

    }
}
