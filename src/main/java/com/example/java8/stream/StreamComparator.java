package com.example.java8.stream;

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.Comparator;
import java.util.List;

public class StreamComparator {
    public static void main(String[] args) {

        List<Emp> emps = EmpDAO.allEmp();
        emps.stream().sorted(Comparator.comparing(e -> e.getId())).forEach(System.out::println);

    }
}
