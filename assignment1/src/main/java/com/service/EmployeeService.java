package com.service;

import com.model.Address;
import com.model.City;
import com.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployees(){
        employeeList.clear();
        Employee emp1 = new Employee(1,"Ran","Zhu",
                new Address(6550,"Sherbrooke West","H4B 1N6",new City("Montreal","QC")));
        Employee emp2 = new Employee(2,"Charlie","Postman",
                new Address(91,"Rue de Troy","H3C 1B7",new City("Verdun","QC")));
        Employee emp3 = new Employee(3,"Samuel","Trudeau",
                new Address(2478,"Saint-Catherine","H2A 5B7",new City("Montreal","QC")));

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        return employeeList;
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
}
