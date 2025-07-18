package utilities;

import peoples.Employee;
import registeredEmployees.RegisteredEmployees;

import java.util.Scanner;

public class ModifySalaries {
    public static void increaseSalaryByPercentage(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        if(CheckId.isValid(id) != true){
            System.out.println("This id is not valid or does not exist, try again.");
            return;
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            for (Employee x : RegisteredEmployees.employeeList){
                if(x.getId() == id){
                    x.setSalary((x.getSalary() / 100 * percentage) + x.getSalary());
                }
            }
        }
    }
}
