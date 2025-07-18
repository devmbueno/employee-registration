# 💼 Employee Registration System

A simple Java console application to register employees, verify IDs, and update salaries.  
_(Project made to test what I learned!)_

---

## 📂 Structure

```plaintext
Main.java
├── utilities/
│   ├── CheckId.java
│   ├── ModifySalaries.java
│   ├── RegisterNewEmployee.java
│   └── ShowEmployee.java
│
├── registeredEmployees/
│   └── RegisteredEmployees.java
│
└── peoples/
    └── Employee.java
```

---

## ⚙️ Features

- ✅ Register employees with unique IDs
- 🔎 Check if an ID is already used
- 📈 Increase salary by percentage
- 👀 Show employees by:
  - ID
  - Salary higher than
  - Salary lower than
- 🧰 Organized with static utility classes

---

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA**
2. Run the `Main.java` class
3. Follow the console prompts to register and manage employees

> 💡 Also works with `javac` + terminal, if you prefer

---

## 🛠 Technologies

- Java 17+ (Compatible with Java 8+)
- IntelliJ IDEA (recommended)

---

## 🙋‍♂️ Author

[Gustavo Miranda](https://github.com/devmbueno)

---

## 📄 Main Class Documentation

### `Main.java`

```java
/**
 * Main.java
 *
 * This is the entry point for the Employee Registration System.
 * It allows the user to register employees, modify their salaries,
 * and display them based on different filters.
 *
 * Author: Gustavo Miranda
 * Repository: https://github.com/devmbueno/employee-registration
 */

import utilities.*;
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
```

---

## 📚 Utilities Overview

### `RegisterNewEmployee.java`
Handles user input for registering employees. Verifies ID availability and creates `Employee` objects.

### `ModifySalaries.java`
Prompts user for ID and percentage. If ID exists, increases salary accordingly.

### `ShowEmployee.java`
Displays employees based on different criteria: all, by ID, salary above or below threshold.

### `CheckId.java`
Static utility class to check whether a given employee ID exists or is already in use.

### `RegisteredEmployees.java`
Stores a static list of all `Employee` objects registered during program execution.

### `Employee.java`
POJO class that represents an employee. Contains fields: `id`, `name`, and `salary`.
