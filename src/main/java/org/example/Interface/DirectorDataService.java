package org.example.Interface;

import org.example.Model.Employee;

import java.util.Map;

public interface DirectorDataService extends SupervisorDataService {
    void create(Employee employee, Map<Integer, Employee> employeeList);
    void assessFine(Employee employee, Double fine);
}
