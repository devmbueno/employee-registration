package utilities;

import peoples.Employee;
import registeredEmployees.RegisteredEmployees;

public class ShowEmployee {
    public static void showAllEmployees(){
        for (Employee x : RegisteredEmployees.employeeList){
            System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
        }
    }
    public static void showEmployee(int id){
        CheckId.isValid(id);
        for(Employee x : RegisteredEmployees.employeeList){
            if(x.getId() == id){
                System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
            }
        }
    }
    public static void showEmployeeWithSalaryHigherThan(double amount){
        boolean existEmployeeWithThisSalary = false;

        for(Employee x : RegisteredEmployees.employeeList){
            if(x.getSalary() > amount){
                existEmployeeWithThisSalary = true;
                System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
            }
        }

        if (!existEmployeeWithThisSalary) {
            System.out.println("There is no one with that salary.");
        }
    }
    public static void showEmployeeWithSalaryLowerThan(double amount){
        boolean existEmployeeWithThisSalary = false;

        for(Employee x : RegisteredEmployees.employeeList){
            if(x.getSalary() < amount){
                System.out.printf(x.getId() + ", " + x.getName() + ", salary: $%.2f%n", x.getSalary());
                existEmployeeWithThisSalary = true;
            }
        }
        if (!existEmployeeWithThisSalary) {
            System.out.println("There is no one with that salary.");
        }
    }

}
