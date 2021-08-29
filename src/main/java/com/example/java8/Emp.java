package com.example.java8;

import lombok.Data;

import java.util.List;

@Data
public class Emp {

    int id;
    String name;
    Long salary;
    int deptId;
    List<String> numbers;
    String status;

    public Emp(int id, String name, Long salary, List<String> numbers ) {
    this.id = id;
    this.name= name;
    this.salary = salary;
    this.numbers = numbers;

    }

    public Emp(int id, String name, Long salary, int deptId, List<String> numbers, String status ) {
        this.id = id;
        this.name= name;
        this.salary = salary;
        this.deptId = deptId;
        this.numbers = numbers;
        this.status=status;
    }
}
