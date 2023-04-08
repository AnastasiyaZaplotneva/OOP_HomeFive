package org.example.View;

import org.example.Model.DataEmployee;
import org.example.Model.Employee;

public class SalesmanView {
    public void view(Employee salesman) {

        if(DataEmployee.getEmployeeList().containsKey(salesman.getId())) {
            System.out.println(DataEmployee.getEmployeeList().get(salesman.getId()).toString());
        }
    }
}
