package com.tnsif.Assignment_1.utilities;

import com.tnsif.Assignment_1.employees.Employee;

/**
 * Utility class to perform operations on Employee objects
 */
public class EmployeeUtilities {

    // Display employee details
    public static void displayEmployeeInfo(Employee e) {
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Salary: " + e.getSalary());
    }

    // Increase salary by a percentage
    public static void increaseSalary(Employee e, double percent) {
        double newSalary = e.getSalary() + (e.getSalary() * percent / 100);
        e.setSalary(newSalary);
    }
}
