package utilities;

import registeredEmployees.RegisteredEmployees;

import peoples.Employee;

import java.util.List;

public class CheckId {
    public static boolean isValid(int id) {
        boolean isValid = false;
        for (Employee x : RegisteredEmployees.employeeList) {
            if(x.getId() == id){
                isValid = true;
            }
        }

        return isValid;
    }

    public static boolean alreadyBusy(int id) {
        for (Employee x : RegisteredEmployees.employeeList) {
            return x.getId() == id ? true : false;
        }

        return false;
    }
}
