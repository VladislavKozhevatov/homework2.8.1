package com.example.homework28;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

        private final EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }


        @GetMapping(path = "/departments/max-salary")
        public Employee getMaxSalary(@RequestParam("departmentId") Integer dep) {
            return employeeService.getEmployeeMaxSalary(dep);
        }

        @GetMapping(path = "/departments/min-salary")
        public Employee getMinSalary(@RequestParam("departmentId") Integer dep) {
            return employeeService.getEmployeeMinSalary(dep);
        }

        @GetMapping(path = "/departments/all")
        public List<Employee> getAllEmployeesByDep(@RequestParam(value = "departmentId", required = false) int departmentID) {
            if (departmentID == 0) {
                return employeeService.getAllEmployeesByDep(departmentID);
            }
            return employeeService.getAllEmployeesByDep(departmentID);
        }
    }
