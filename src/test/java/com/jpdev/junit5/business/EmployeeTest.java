package com.jpdev.junit5.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    /*
    1. Falla
    2. Añadir codigo suficiente para pasar el test
    3. Refactorizar
     */
    @Test
    void testSalary() {
        Employee employee = new Employee("TM");
        double salary = employee.calculateSalary();
        Assertions.assertEquals(5000, salary);
    }

}
