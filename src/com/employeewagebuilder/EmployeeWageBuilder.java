package com.employeewagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
        public static final int Is_Part_Time = 0;
        public static final int  Is_Full_Time = 1;

        public static void CalculateEmpWage(String Company, int Emp_Wage_Per_Hour,int NumofWorkingDays,int MaxHoursPerMonth) {
        int EmpHours = 0;
        int EmpWage = 0;
        int TotalEmpHours = 0;
        int TotalWorkingDays = 0;
        int TotalEmpWage = 0;
        Random R = new Random();
            while(TotalEmpHours<=MaxHoursPerMonth && TotalWorkingDays<NumofWorkingDays){
                TotalWorkingDays++;
                int EmpCheck = R.nextInt(2);
                switch (EmpCheck) {
                    case Is_Part_Time:
                        EmpHours = 4;
                        break;
                    case Is_Full_Time:
                        EmpHours = 8;
                        break;
                    default:
                        EmpHours = 0;
                }
                TotalEmpHours += EmpHours;
                EmpWage = EmpHours * Emp_Wage_Per_Hour;
                TotalEmpWage += EmpWage;
                System.out.println("Employee Wage : " + EmpWage);
            }
            System.out.println("Total Employee Wage : " +TotalEmpWage);
    }

    public static void main(String[] args) {
        CalculateEmpWage("Honda",40,10,300);
    }
}
