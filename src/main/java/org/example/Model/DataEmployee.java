package org.example.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataEmployee {
    private static Map<Integer,Employee> employeeList = new HashMap<>();
    private static Map<Integer, Double> salaryList = new HashMap<>();

    public static Map<Integer, Double> getSalaryList() {
        return salaryList;
    }

    public static void setSalaryList(Map<Integer, Double> salaryList) {
        DataEmployee.salaryList = salaryList;
    }

    public static Map<Integer,Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(Map<Integer, Employee> employeeList) {
        DataEmployee.employeeList = employeeList;
    }
}
