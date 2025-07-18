package utilities;

import peoples.Employee;
import registeredEmployees.RegisteredEmployees;

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
        boolean busy = false;
        for (Employee x : RegisteredEmployees.employeeList) {
            if (x.getId() == id) {
                busy = true;
            }
        }

        return busy;
    }
}
