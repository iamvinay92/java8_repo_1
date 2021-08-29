package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDAO {

    public static List<Emp> allEmp(){
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(1,"pqr", 3000L, Arrays.asList("123", "456")));
        empList.add(new Emp(2,"cde", 5000L,Arrays.asList("101", "102")));
        empList.add(new Emp(3,"pqr", 2000L, Arrays.asList("103", "104")));
        empList.add(new Emp(12,"mno", 12000L,Arrays.asList("105", "106")));
        empList.add(new Emp(14,"mno", 22000L,Arrays.asList("105", "106")));
        empList.add(new Emp(22,"abc", 65000L,Arrays.asList("108", "109")));


        return empList;
    }
}
