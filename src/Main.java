import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import registeredEmployees.RegisteredEmployees;
import utilities.*;



public class Main {
    public static void main(String[] args) {
        RegisterNewEmployee.addEmployee();
        System.out.println();
        ModifySalaries.increaseSalaryByPercentage();
        System.out.println();
        ShowEmployee.showAllEmployees();
    }


}
