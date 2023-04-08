package org.example.Interface;

import org.example.Interface.DataService;
import org.example.Model.Employee;

import java.util.Map;

public interface SupervisorDataService extends DataService {

    void calcSalary(Employee employee, Map<Integer, Double> salaryList);
}
