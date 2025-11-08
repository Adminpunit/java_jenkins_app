package com.example.ems;

public class App {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(1, "Ayan", "Engineering"));
        service.addEmployee(new Employee(2, "Ravi", "HR"));

        System.out.println("All Employees:");
        service.getAllEmployees().forEach(System.out::println);
    }
}
