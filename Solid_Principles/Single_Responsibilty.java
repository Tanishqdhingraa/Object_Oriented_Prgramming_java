package Solid_Principles;

/*
=========================================
! SINGLE RESPONSIBILITY PRINCIPLE (SRP)
=========================================

Definition:
! A class should have only ONE reason to change.


!In simple words:
!One class = One responsibility (One job).

Why?
- Easy to understand
- Easy to maintain
- Easy to test
- Less bugs
- Code becomes reusable

Bad Example:
Imagine an Employee class that:
1. Stores employee data
2. Calculates salary
3. Saves employee to database
4. Prints employee details

If database changes, salary calculation changes,
or printing format changes,
the same class needs modification.

It has multiple reasons to change.
This violates SRP.

Good Example:
!Split responsibilities into different classes.

! Employee          -> Stores employee information
! SalaryCalculator  -> Calculates salary
! EmployeeDAO       -> Saves employee to database
! EmployeePrinter   -> Prints employee details

?Interview Definition:
!"A class should have only one responsibility,
!meaning it should have only one reason to change."

Real Life Example:
Restaurant

Chef        -> Cooks food
Waiter      -> Serves food
Cashier     -> Handles payment

If waiter also cooks food,
the responsibilities are mixed.

That violates SRP.
*/

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SalaryCalculator {

    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.10;
    }
}

class EmployeePrinter {

    public void print(Employee employee) {
        System.out.println("Employee Name : " + 
        employee.getName());
        System.out.println("Salary        : " + 
        employee.getSalary());
    }
}

public class Single_Responsibilty {

    public static void main(String[] args) {

        Employee emp = new Employee("Tanishq", 
        50000);

        SalaryCalculator calculator = new SalaryCalculator();
        EmployeePrinter printer = new EmployeePrinter();

        printer.print(emp);

        System.out.println("Bonus : " + 
        calculator.calculateBonus(emp));
    }
}