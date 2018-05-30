package com.clinkast.dao;

import com.clinkast.beans.Employee;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDataBaseManager {
    private static Map<Long,Employee> store;
    private static InMemoryDataBaseManager instance = null;

    private InMemoryDataBaseManager() {
        store = new HashMap<>();
        initOneContact();
    }

    public static Map<Long,Employee> getStore() {
        if(instance==null) {
            instance = new InMemoryDataBaseManager();
        }
        return store;
    }

    private static void initOneContact() {
        Employee cHuang = new Employee(12L,"yassine","labyed","49 rue des étudiant", new Date(1993,6,17));
        store.put(cHuang.getId(), cHuang);
    }

    public static void addEmployee(Employee employee){
        if(instance==null) {
            instance = new InMemoryDataBaseManager();
        }
        store.put(employee.getId(),employee);
    }

    public static Employee deleteEmployee(Long id){
        if(instance==null) {
            instance = new InMemoryDataBaseManager();
        }
        Employee employee = store.get(id);
        store.remove(id);
        return employee;
    }
}
