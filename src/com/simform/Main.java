package com.simform;

import com.simform.data.Employee;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee name : ");
        String name = scn.nextLine();
        emp.setEmpName(name);

        System.out.print("Enter Employee Id : ");
        int id = scn.nextInt();
        emp.setEmpId(id);

        System.out.print("Enter Employee Dept : ");
        String dept = scn.next();
        emp.setEmpDept(dept);

        System.out.println("Welcome to Simform Family !!");
        System.out.println("Employee ID : " + emp.getEmpDept());
        System.out.println("Employee name : " + emp.getEmpName());
        System.out.println("Employee Dept : " + emp.getEmpDept());

    }
}