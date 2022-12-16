package com.sumanth.interview;

public class Employee {

    int id;
    String name;
    String dept;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1);
        System.out.println(e1.equals(e2));
    }


}
