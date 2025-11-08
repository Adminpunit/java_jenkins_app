package com.example.ems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    @Test
    public void testAddEmployee() {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(1, "Ayan", "IT"));
        assertEquals(1, service.getAllEmployees().size());
    }
}
