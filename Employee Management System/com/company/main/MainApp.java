package com.company.main;

import com.company.hr.Employee;      // Single import
import com.company.payroll.*;        // On-demand import

public class MainApp {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(101);
        e.setName("Rahul");
        e.setDepartment("IT");
        e.setSalary(50000);

        Payroll p = new Payroll();
        double totalSalary = p.calculateBonus(e);

        System.out.println("Employee Details");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Salary After Bonus: " + totalSalary);

    }
}