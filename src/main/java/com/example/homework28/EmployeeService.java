package com.example.homework28;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceInter{


    private List<Employee> employees = List.of(
            new Employee("Николаев Пётр Сергеевик", 1, 48000),
            new Employee("Иванов Сергей иванович", 1, 69000),
            new Employee("Семёнов Андрей Петрович", 2, 67000),
            new Employee("Антонов Михаил Сергеевич", 2, 100000),
            new Employee("Рудаков Анатолий Петрович", 2, 54000),
            new Employee("Гаврилов Сергей Анатольевич", 3, 44000),
            new Employee("Панфилоа Алексей Семёнович", 3, 67000),
            new Employee("Талапин Вадим Евгеньевич", 4, 48000),
            new Employee("Короленко Вячеслав Петрович", 4, 89000),
            new Employee("Васильев Василий Васильевич", 5, 99000),
            new Employee("Анатольев Афанасий Павлович", 5, 35000)
    );

    @Override
    public Employee getEmployeeMaxSalary(int department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .max(Comparator.comparingInt(employee -> employee.getSalary()))
                .orElse(null);
    }

    @Override
    public Employee getEmployeeMinSalary(int department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .min(Comparator.comparingInt(employee -> employee.getSalary()))
                .orElse(null);
    }

    @Override
    public List<Employee> getAllEmployeesByDep(int department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == department)
                .collect(Collectors.toUnmodifiableList());
    }


}
