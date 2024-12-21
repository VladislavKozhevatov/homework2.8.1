package com.example.homework28;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    private EmployeeService employeeService;

    public DepartmentController(DepartmentService departmentService,EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    @GetMapping("/fullData")
     public void fullData(){
        employeeService.fullfillData();
        return;
    }

     @GetMapping(path = "/max-salary")
    public Employee getEmployeeWithMaxSalary(@RequestParam("departmentId") String departmentId) {
        return departmentService.getEmployeeMaxSalary(departmentId);
    }

    @GetMapping(path = "/min-salary")
    public Employee getEmployeeWithMinSalary(@RequestParam("departmentId") String departmentId) {
        return departmentService.getEmployeeMinSalary(departmentId);
    }

    @GetMapping(path = "/all")
    public Map<String, List<Employee>> getAllEmployeesByDepartment(@RequestParam(value = "departmentId", required = false) String departmentId) {
        if (departmentId == null) {
            return departmentService.getAllEmployeesByDepartments();
        }
        return departmentService.getAllEmployeesByDepartment(departmentId);

    }
}