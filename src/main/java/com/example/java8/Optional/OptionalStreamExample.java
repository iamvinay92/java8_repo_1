package com.example.java8.Optional;


/*
* An example where check if given name is present in stream of EMP.if not then throw custom exception with
* proper message
* */

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.List;

public class OptionalStreamExample {
    public static void main(String[] args) throws NoSuchFieldException {

        System.out.println("res is "+ checkValue("pqr"));
    }

    public static Emp checkValue(String str) throws NoSuchFieldException {

        List<Emp> empList = EmpDAO.allEmp();
        return empList.stream().filter( emp -> emp.getName().equalsIgnoreCase(str)).findAny().orElseThrow(() -> new NoSuchFieldException("no such value is present "));
    }
}
