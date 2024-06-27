package com.swathi.assignment;
import com.swathi.assignment.employees.Manager;
import com.swathi.assignment.employees.Developer;
import com.swathi.assignment.utilities.EmployeeUtilities;

/*
  Main class to demonstrate usage of Employee and its subclasses, and EmployeeUtilities.
 */
public class AssignmentMain {

    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("John Doe", 1001, 80000, "Sales");
        Developer developer = new Developer("Jane Smith", 2001, 60000, "Java");

        // Create an instance of EmployeeUtilities
        EmployeeUtilities employeeUtilities = new EmployeeUtilities();

        // Use EmployeeUtilities methods
        employeeUtilities.printManagerDetails(manager);
        employeeUtilities.printDeveloperDetails(developer);

        // Example of increasing salary using EmployeeUtilities
        employeeUtilities.increaseSalary(manager, 10);
        employeeUtilities.increaseSalary(developer, 5);

        // Print updated details
        System.out.println("\nAfter salary increase:");
        employeeUtilities.printManagerDetails(manager);
        employeeUtilities.printDeveloperDetails(developer);
    }
}
