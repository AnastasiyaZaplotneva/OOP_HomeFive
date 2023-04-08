package org.example.View;

import org.example.Model.DataEmployee;
import org.example.Model.Employee;

import java.util.Map;

public class DirectorView {
    public void view(Employee salesman) {

        if(DataEmployee.getEmployeeList().containsKey(salesman.getId())) {
            System.out.println(DataEmployee.getEmployeeList().get(salesman.getId()).toString());
        }
    }
    public void viewAll(Map<Integer,Employee> employeeList) {
        employeeList.entrySet().forEach(System.out::println);

    }

    public void viewSalary (Map<Integer, Double> salaryList) {
        salaryList.entrySet().forEach(System.out::println);
    }
}
