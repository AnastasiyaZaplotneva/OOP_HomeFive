package org.example.Service;

import org.example.Interface.DataService;
import org.example.Model.Employee;

import java.util.Map;

public class SalesmanService implements DataService {

    @Override
    public void read(Integer id, Map<Integer, Employee> employeeList) {
        if(employeeList.containsKey(id)) {
            System.out.println(employeeList.get(id).toString());
        }
    }
}
