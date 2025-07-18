package utilities;

import peoples.Employee;
import registeredEmployees.RegisteredEmployees;

import java.util.List;

public class ShowEmployee {
    public static void showAllEmployees(){
        for (Employee x : RegisteredEmployees.employeeList){
            System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
        }
    }
    public static void showEmployee(int id){
        for(Employee x : RegisteredEmployees.employeeList){
            if(x.getId() == id){
                System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
            }
        }
    }
    public static void showEmployeeWithSalaryHigherThan(double amount){
        for(Employee x : RegisteredEmployees.employeeList){
            if(x.getSalary() > amount){
                System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
            }
        }
    }
    public static void showEmployeeWithSalaryLowerThan(double amount){
        for(Employee x : RegisteredEmployees.employeeList){
            if(x.getSalary() < amount){
                System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
            }
        }
    }

}
