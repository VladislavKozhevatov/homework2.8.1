package com.example.homework28;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentService  {

 private EmployeeService employeeService ;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
 

    public Map<String, List<Employee>> getAllEmployees (){
        List <Employee> employees = employeeService.getAllEmployees();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }


    public Employee getEmployeeMaxSalary(String department) {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .max(Comparator.comparingInt(employee -> employee.getSalary()))
                .orElse(null);
    }


    public Employee getEmployeeMinSalary(String department) {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .min(Comparator.comparingInt(employee -> employee.getSalary()))
                .orElse(null);
    }

    public Map<String, List<Employee>> getAllEmployeesByDepartment (String department){
        List <Employee> employees = employeeService.getAllEmployees();
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    public Map<String, List<Employee>> getAllEmployeesByDepartments (){
        List <Employee> employees = employeeService.getAllEmployees();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));


    }
}

//implements DepartmentServiceInterface