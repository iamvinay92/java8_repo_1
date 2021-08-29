package com.example.java8.AllStreamExamples;

/*
 * Find avg salary of empl whoes name is pqr
 *
 * */

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FindAvgSal {
    public static void main(String[] args) {

        /*
        * FInd avg salary of emp whose name is pqr
        *
        * */

        List<Emp> empList = EmpDAO.allEmp();
        Double pqr = empList.stream().filter(e -> e.getName().equals("pqr"))
                .map(e -> e.getSalary())
                .mapToDouble(e -> e)
                .average().getAsDouble();
        System.out.println("emp pqr avg salary is "+ pqr);


        /*
         * FInd sum salary of emp whose name is pqr
         *
         * */

        Double pqr1 = empList.stream().filter(e -> e.getName().equals("pqr"))
                .map(e -> e.getSalary())
                .mapToDouble(e -> e)
                .sum();
        System.out.println("emp pqr avg salary is "+ pqr1);



    }



}
