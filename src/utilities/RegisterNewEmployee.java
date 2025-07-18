package utilities;

import peoples.Employee;
import registeredEmployees.RegisteredEmployees;

import java.util.Scanner;

public class RegisterNewEmployee {
    public static void addEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantityToRegister = sc.nextInt();

        for (int i = 0; i < quantityToRegister; i++) {
            System.out.println();

            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            if (CheckId.alreadyBusy(id)) {
                i--;
                System.out.println("This id is already busy, try again.");
            } else {

                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                Employee employee = new Employee(id, name, salary);

                RegisteredEmployees.employeeList.add(employee);
            }
        }
    }
}
