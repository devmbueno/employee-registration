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
public class Main {
    public static void main(String[] args) {
        RegisterNewEmployee.addEmployee();              // Register employees via user input
        ModifySalaries.increaseSalaryByPercentage();    // Apply salary increase
        ShowEmployee.showAllEmployees();                // Print all registered employees
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
