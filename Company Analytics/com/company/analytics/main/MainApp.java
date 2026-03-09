package com.company.analytics.main;

import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class MainApp {

    public static void main(String[] args) {

        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        System.out.println("Company Analytics Report\n");

        s.showSales();
        e.showEmployees();

    }
}