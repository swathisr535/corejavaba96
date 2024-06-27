package com.swathi.assignment.utilities;

import com.swathi.assignment.employees.Employee;
import com.swathi.assignment.employees.Manager;
import com.swathi.assignment.employees.Developer;


public class EmployeeUtilities {

    /*
      Increases the salary of an employee by a specified percentage.
     
       employee   The employee whose salary needs to be increased.
       percentage The percentage by which to increase the salary.
     */
    public void increaseSalary(Employee employee, double percentage) {
        double currentSalary = employee.getSalary();
        double increaseAmount = currentSalary * (percentage / 100);
        double newSalary = currentSalary + increaseAmount;
        employee.setSalary(newSalary);
    }

    /*
      Prints the details of a manager including their department.
     
       manager The manager whose details need to be printed.
     */
    public void printManagerDetails(Manager manager) {
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        System.out.println("Salary: $" + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
    }

    /*
      Prints the details of a developer including their programming language.
     
        developer The developer whose details need to be printed.
     */
    public void printDeveloperDetails(Developer developer) {
        System.out.println("Developer Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: $" + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
