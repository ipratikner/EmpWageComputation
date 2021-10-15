package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Program");

        //to check is emp present or not
        int Is_EmpPresent=1;
        double empCheck = Math.floor(Math.random() * 10 ) % 2 ;
        if(empCheck == Is_EmpPresent)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent ");
    }
}
