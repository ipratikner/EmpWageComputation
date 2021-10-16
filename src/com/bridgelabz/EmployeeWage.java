package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {

        //Constatnts
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_RATE_PER_HOUR =20;

        //Variables
        int empHrs =0;
        int empWage =0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10 ) % 3 ;
        if(empCheck == IS_FULL_TIME) {
            empHrs = 16;
            empWage = empHrs *  EMP_RATE_PER_HOUR;
            System.out.println(" Full Time Employee Wage is " +empWage );
        }
        else if(empCheck == IS_PART_TIME) {
            empHrs = 8;
            empWage = empHrs *  EMP_RATE_PER_HOUR;
            System.out.println(" Part Time Employee Wage is " +empWage );
        }
        else {
            empHrs= 0;
            empWage = empHrs *  EMP_RATE_PER_HOUR;
            System.out.println("Employee is Absent and Wage is " +empWage );
        }
    }
}
