package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {

        //calculate daily wages

        //constants
        int IS_EMP_PRESENT=1;
        int EMP_RATE_PER_HOUR =20;

        //Variable
        int empHrs =0;
        int empWage =0;

        //computation
        double empCheck = Math.floor(Math.random() * 10 ) % 2 ;
        if(empCheck == IS_EMP_PRESENT)
            empHrs =8;
        else
            empHrs =0;
        empWage = empHrs *  EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is " +empWage );

    }
}
