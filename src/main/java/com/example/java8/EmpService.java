package com.example.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
* Lambda expression syntax: () params input -> lambda expre {  body };
*
* Lambda expression is only applicable on Functional Interfaces.
* */

public class EmpService {
    public static void main(String[] args) {

        List<Emp> empList = EmpDAO.allEmp();
//        Collections.sort(empList, new TestComparator());

//        Collections.sort(empList, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName())  );
        Collections.sort(empList, (e1,e2) -> e1.getName().compareTo(e1.getName()));
        System.out.println("emps are "+ empList);

    }
}

/*class TestComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return e2.getName().compareTo(e1.getName());
    }
}*/