package org.example.Service;

import org.example.Interface.SupervisorDataService;
import org.example.Model.Employee;

import java.util.Map;

public class AccountantService implements SupervisorDataService {
    @Override
    public void read(Integer id, Map<Integer, Employee> employeeList) {
        if(employeeList.containsKey(id)) {
            System.out.println(employeeList.get(id).toString());
        }
    }


    @Override
    public void calcSalary(Employee employee, Map<Integer, Double> salaryList) {
        salaryList.put(employee.getId(), employee.calculateSalary());

    }
}
