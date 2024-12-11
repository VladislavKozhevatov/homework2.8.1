package com.example.homework28;


import java.util.List;

public interface EmployeeServiceInter {

    Employee getEmployeeMaxSalary (int department);
    Employee getEmployeeMinSalary (int department);
    List<Employee> getAllEmployeesByDep(int department);


}
