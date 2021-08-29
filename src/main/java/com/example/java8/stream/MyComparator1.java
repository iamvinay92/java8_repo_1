package com.example.java8.stream;

import com.example.java8.Emp;
import com.example.java8.EmpDAO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator1 implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.getSalary().compareTo(e2.getSalary()); // Ascending
    }

    public static void main(String[] args) {

        List<Emp> empList = EmpDAO.allEmp();

//        Collections.sort(empList, new MyComparator1());
        Collections.sort(empList, (e1,e2) ->  e1.getSalary().compareTo(e2.getSalary()));
        System.out.println("emp sal are "+ empList);


    }

}
