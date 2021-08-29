package com.example.java8.stream;

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
*
* Stream API is used to perform operations on a collection of objects.
*
* Stream is not a Data structure, it just takes a collection of objects e.g. Arrays, Collections
* as a input and perform operations on them as per pipelined methods (map, filter etc) and provide result
*
* */

public class StreamListSorting {
    public static void main(String[] args) {

        List<Emp> empList = EmpDAO.allEmp();
        empList.stream().sorted((e1, e2)  -> e1.getName().compareTo(e2.getName())).forEach( e -> System.out.println(": "+ e));
//        list1.forEach( (e) -> System.out.println(" : "+ e));

        List<Integer> numbers = Arrays.asList(5,7,2,3,9);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        empList.forEach(e -> System.out.println("id: " + e.getId()));

    }
}
