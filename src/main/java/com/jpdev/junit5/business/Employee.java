package com.jpdev.junit5.business;

public class Employee {

    public static final String TEAM_MEMBER = "TM";
    private final String employeeType;

    public Employee(String employeeType) {
        this.employeeType = employeeType;
    }

    public double calculateSalary() {
        if (employeeType.equals(TEAM_MEMBER)) {
            return 5000.00;
        }
        return 3000.0;
    }
}
