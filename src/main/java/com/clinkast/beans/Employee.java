package com.clinkast.beans;


public class Employee {
    private static Long count = 0L;
    private Long id = 0L;
    private EmployeeDetails employeeDetails;

    public Employee() {
        super();
    }

    public Employee(EmployeeDetails employeeDetails) {
        this.id = count++;
        this.employeeDetails = employeeDetails;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
