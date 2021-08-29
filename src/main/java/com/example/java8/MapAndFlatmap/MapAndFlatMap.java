package com.example.java8.MapAndFlatmap;

/*
* MAP: map is used to data transformation
* Map takes the stream<T> as a input and returns stream<R> result. i.e. Stream<R> map(Stream<T> input)
* Map produces a single output for single input. one-to-one mapping.
* Ex. Stream of String ('a', 'b', 'c'); --> Stream of ('A', 'B', 'C')
*
*
* FlatMap: Flatmap is used for data transformation + Flattering i.e. map() + Flattering
* Flatmap takes Stream<Stream<T>> and returns Stream<R> i.e. Strean<R> map(Stream<Stream<T>> input)
* Map produces a multiple values for single input. one-to-many mapping.
* Ex. Stream of Stream ((1,2), (3,4))  --> output into single stream (1,2,3,4) --> STream of stream into single stream
*
 * */

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {

        List<Emp> list = EmpDAO.allEmp();
        /*
        * 1.MAP: List<Emp> --> List<String>
        * */

        List<String> names = list.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println("map result is "+ names);

        /*
         * 2.
         * */
        List<List<String>> collect = list.stream().map(emp -> emp.getNumbers()).collect(Collectors.toList());
        System.out.println("stream of stream result is "+ collect);

        /*
         * 3.FlatMap: List<String> -->
         * */
        List<String> flatmapCollect = list.stream().flatMap(emp -> emp.getNumbers().stream()).collect(Collectors.toList());
        System.out.println("flatmap stream of String result is "+ flatmapCollect);

        String str = "i love java";
        long cnt = str.chars().mapToObj(c ->(char) c).filter(c -> c == 'a').count();

        System.out.println("result is "+ cnt);
    }
}
