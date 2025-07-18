/**
 * Main.java
 * <p>
 * This is the entry point for the Employee Registration System.
 * It allows the user to register employees, modify their salaries,
 * and display them based on different filters.
 * <p>
 * Author: Gustavo Miranda
 * Repository: https://github.com/devmbueno/employee-registration
 */

import utilities.ModifySalaries;
import utilities.RegisterNewEmployee;
import utilities.ShowEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("=== Employee Registration System ===");
        System.out.println();

        // Register new employees
        RegisterNewEmployee.addEmployee();
        System.out.println();

        // Modify salary by ID
        ModifySalaries.increaseSalaryByPercentage();
        System.out.println();

        // Display all employees
        System.out.println("=== All Registered Employees ===");
        ShowEmployee.showAllEmployees();
        System.out.println();

        // Display employee by ID
        System.out.print("Enter an ID to search an employee: ");
        int idToSearch = sc.nextInt();
        System.out.println("Employee with ID " + idToSearch + ":");
        ShowEmployee.showEmployee(idToSearch);
        System.out.println();

        // Show employees with salary above a threshold
        System.out.print("Enter a salary to filter employees with HIGHER salaries: ");
        double higherSalary = sc.nextDouble();
        System.out.println("Employees with salary above $" + higherSalary + ":");
        ShowEmployee.showEmployeeWithSalaryHigherThan(higherSalary);
        System.out.println();

        // Show employees with salary below a threshold
        System.out.print("Enter a salary to filter employees with LOWER salaries: ");
        double lowerSalary = sc.nextDouble();
        System.out.println("Employees with salary below $" + lowerSalary + ":");
        ShowEmployee.showEmployeeWithSalaryLowerThan(lowerSalary);
        System.out.println();

        System.out.println("=== Program Finished ===");
        sc.close();
    }
}