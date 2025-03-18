/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeemanager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EmployeeManager {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding employees
        System.out.println("Enter number of employees to add: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            employees.add(new Employee(name, salary));
        }

        // Displaying all employees before removal
        System.out.println("\n--- Employee List Before Removal ---");
        for (Employee employee : employees) {
            employee.display();
        }

        // Removing an employee
        System.out.print("\nEnter the index of the employee to remove (0 to " + (employees.size() - 1) + "): ");
        int removeIndex = scanner.nextInt();

        // Validate index and remove employee
        if (removeIndex >= 0 && removeIndex < employees.size()) {
            employees.remove(removeIndex);
            System.out.println("\nEmployee at index " + removeIndex + " has been removed.");
        } else {
            System.out.println("Invalid index.");
        }

        // Displaying all employees after removal
        System.out.println("\n--- Employee List After Removal ---");
        for (Employee employee : employees) {
            employee.display();
        }

        scanner.close();
    }
}
