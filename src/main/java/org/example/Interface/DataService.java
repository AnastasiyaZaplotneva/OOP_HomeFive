package org.example.Interface;

import org.example.Model.Employee;

import java.util.List;
import java.util.Map;

public interface DataService {
    void read(Integer id, Map<Integer, Employee> employeeList);
}
