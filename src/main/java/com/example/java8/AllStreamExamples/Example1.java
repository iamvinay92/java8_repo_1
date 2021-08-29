package com.example.java8.AllStreamExamples;

import com.example.java8.Emp;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<Emp> empList = lstEmp();
//        empList.stream().forEach(e -> System.out.println("emp is" + e));

        /*
         * 1. To print emp details based on their Department
         * */

        final Map<Integer, List<Emp>> emps = empList.stream().collect(Collectors.groupingBy(Emp::getDeptId));
        emps.entrySet().forEach(
                e -> System.out.println("Dept id: ___ " + e.getKey() + " and its associated emp lists are: " + e.getValue())
        );
//        empList.forEach(e -> System.out.println("emp name "+ e.getName() +" dept: "+ e.getDeptId()));


        /*
         * 2. To print count of employees working in each dept
         * */
        Map<Integer, Long> collect = empList.stream().collect(Collectors.groupingBy(e -> e.getDeptId(), Collectors.counting()));
        collect.entrySet().forEach(
                e -> System.out.println(" dept Id is " + e.getKey() + " emp count" + e.getValue())
        );

        /*
         * 3. To print Active n Inactive emp details
         * */

        long activeCount = empList.stream().filter(e -> "active".equalsIgnoreCase(e.getStatus())).count();
        System.out.println("activeCount: " + activeCount);
        long inactiveCount = empList.stream().filter(e -> "InActive".equalsIgnoreCase(e.getStatus())).count();
        System.out.println("inactiveCount: " + inactiveCount);

        /*
         * 4. To print min/ max salary of employee
         * */

        long maxSal = empList.stream().mapToLong(Emp::getSalary).max().getAsLong();

//        or
//        Optional<Emp> maxSal = empList.stream().max(Comparator.comparing(Emp::getSalary));

        System.out.println("max sal is: " + maxSal);

        long minSal = empList.stream().mapToLong(Emp::getSalary).min().getAsLong();
//        or
//        Optional<Emp> minSal = empList.stream().min(Comparator.comparing(Emp::getSalary));
        System.out.println("min sal is: " + minSal);


        /*
         * 4. To print MAX salary of employee from each department
         * */

        empList.stream().collect(Collectors.groupingBy(Emp::getDeptId, Collectors.counting()));


    }

    public static List<Emp> lstEmp() {
        List<Emp> empList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            int deptId = 1;
            String status = "active";
            if (i > 50 && i < 75) {
                deptId = 2;
            } else if (i > 75) {
                deptId = 3;
                status = "InActive";
            }
            empList.add(new Emp(i, "emp" + i, (long) (Math.random() * 100), deptId, Arrays.asList("123", "456"), status));
        }
        return empList;
    }

}
