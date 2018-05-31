package com.clinkast.dao;

import com.clinkast.beans.Employee;
import com.clinkast.beans.EmployeeDetails;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDataBaseManager {
    private static Map<Long, Employee> employees;
    private static InMemoryDataBaseManager instance = null;

    private InMemoryDataBaseManager() {
        employees = new HashMap<>();
        initEmployees();
    }

    public static Map<Long, Employee> getEmployees() {
        if (instance == null) {
            instance = new InMemoryDataBaseManager();
        }
        return employees;
    }

    public static Employee getEmployee(Long id) {
        if (instance == null) {
            instance = new InMemoryDataBaseManager();
        }
        return employees.get(id);
    }

    private static void initEmployees() {
        Employee employee1 = new Employee(new EmployeeDetails("Yassine", "Labyed", "NY",
                "labyed.yassine@gmail.com", "0650805349", "69 avenue Gambetta", new Date()));
        employees.put(employee1.getId(), employee1);
        Employee employee2 = new Employee(new EmployeeDetails("Issam", "Fatah", "ClinKast",
                "fatah.issam@gmail.com", "0677676766", "rue des étudiants", new Date()));
        employees.put(employee2.getId(), employee2);
        Employee employee3 = new Employee(new EmployeeDetails("Fadel", "NaN", "ClinKast",
                "Nan.Fadel@gmail.com", "087698349", "Gare du Nord", new Date()));
        employees.put(employee3.getId(), employee3);
    }

    public static Employee addEmployee(EmployeeDetails employeeDetails) {
        Employee employee = new Employee(employeeDetails);
        employees.put(employee.getId(), employee);
        return employee;
    }

    public static Employee editEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        return employee;
    }

    public static void deleteEmployee(Long id) {
        employees.remove(id);
    }
}
