package org.example;

import org.example.Model.*;
import org.example.Service.AccountantService;
import org.example.Service.DirectorService;
import org.example.Service.SalesmanService;
import org.example.View.AccountantView;
import org.example.View.DirectorView;
import org.example.View.SalesmanView;

public class Controller {
    public static void main(String[] args) {

        // Инициализация данных
        Employee salesman1 = new Salesman("Ivan Petrov", 27, 3, 1, 164);
        Employee salesman2 = new Salesman("Sergey Sidorov", 29, 6, 2, 164);
        Employee salesman3 = new Salesman("Evgeniy Popov", 23, 2, 3, 147);
        Employee accountant = new Accountant("Svetlana Ivanova", 43, 15, 4,
                    45000.0, 21, 21);
        Employee director = new Director("Aleksandr Minin", 37, 9, 5,
                    60000.0, 21, 20);


        // проверка функционала

        DirectorService directorService = new DirectorService();
        directorService.create(salesman1, DataEmployee.getEmployeeList());
        directorService.create(salesman2, DataEmployee.getEmployeeList());
        directorService.create(salesman3, DataEmployee.getEmployeeList());
        directorService.create(accountant, DataEmployee.getEmployeeList());
        directorService.create(director, DataEmployee.getEmployeeList());

        directorService.calcSalary(salesman1, DataEmployee.getSalaryList());
        directorService.calcSalary(accountant, DataEmployee.getSalaryList());

        directorService.assessFine(salesman1, 500.0);

        AccountantService accountantService = new AccountantService();
        accountantService.calcSalary(salesman2, DataEmployee.getSalaryList());
        accountantService.calcSalary(salesman3, DataEmployee.getSalaryList());
        accountantService.calcSalary(director, DataEmployee.getSalaryList());

        SalesmanService salesmanService = new SalesmanService();
        salesmanService.read(2,DataEmployee.getEmployeeList());
        System.out.println();

        DirectorView directorView = new DirectorView();
        directorView.viewAll(DataEmployee.getEmployeeList());
        System.out.println();

        AccountantView accountantView = new AccountantView();
        accountantView.viewSalary(DataEmployee.getSalaryList());
        System.out.println();

        SalesmanView salesmanView = new SalesmanView();
        salesmanView.view(salesman3);

    }
}
