package com.api;

import com.service.EmployeeService;
import com.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        EmployeeService empService = new EmployeeService();
        return empService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        for (Employee emp: EmployeeService.employeeList){
            if(emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    @PostMapping("/employee")
    public List<Employee> addEmployee(@RequestBody Employee emp){
        EmployeeService empService = new EmployeeService();
        empService.addEmployee(emp);
        return EmployeeService.employeeList;
    }
}
