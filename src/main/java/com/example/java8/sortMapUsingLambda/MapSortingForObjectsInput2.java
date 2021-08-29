package com.example.java8.sortMapUsingLambda;

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.*;
import java.util.stream.Stream;

public class MapSortingForObjectsInput2 {
    public static void main(String[] args) {

      Map<Emp,Integer> empList = new TreeMap<>(new Comparator<Emp> () {

          @Override
          public int compare(Emp e1, Emp e2) {
              return e2.getName().compareTo(e1.getName());
          }
      });

      /*OPTIMIZED using lambda expression */
        Map<Emp,Integer> empList1= new TreeMap<>( (e1, e2) -> e2.getName().compareTo(e1.getName()));

        empList1.put(new Emp(1,"abc", 10000L, Arrays.asList("123", "456")), 1);
        empList1.put(new Emp(5,"ddd", 40000L, Arrays.asList("123", "456")), 2);
        empList1.put(new Emp(2,"zzz", 20000L, Arrays.asList("123", "456")), 4);

        System.out.println(": "+ empList1);

        /*  USING STREAM */

        empList1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Emp::getSalary))).forEach(System.out::println);

    }
}
