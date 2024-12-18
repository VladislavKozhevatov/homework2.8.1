package com.example.homework28;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service
public class EmployeeService {

    private Map<String, Employee> employees;

    public EmployeeService() {
        this.employees = new HashMap<>();
    }

    public void addEmployee (Employee employee){
        employees.put(employee.getFullName(),employee);
    }

    public Employee findEmployee (String fullName){
        return employees.get(fullName);
    }


    public void deleteEmployee (String fullName){
        employees.remove(fullName);
    }


    public List<Employee> getAllEmployees (){
        return  new ArrayList<>(employees.values());
    }


    public void fullfillData (){
        employees.put("Иванов Иван Иванович",new Employee("Иванов Иван Иванович","1",35000));
        employees.put("Семёнов Андрей Петрович",new Employee("Семёнов Андрей Петрович","1",38000));
        employees.put("Антонов Михаил Сергеевич",new Employee("Антонов Михаил Сергеевич","2",40000));
        employees.put("Гаврилов Сергей Анатольевич",new Employee("Иванов Иван Иванович","2",39000));
        employees.put("Короленко Вячеслав Петрович",new Employee("Короленко Вячеслав Петрович","3",28000));
        employees.put("Пелепенко Артур Тигранович",new Employee("Короленко Вячеслав Петрович","4",42000));
        employees.put("Кизляр Егор Антонович",new Employee("Короленко Вячеслав Петрович","5",40000));
        employees.put("Кожин Владимир Владимироваич",new Employee("Короленко Вячеслав Петрович","5",46000));
        employees.put("Кожин Владимир Владимироваи",new Employee("Кожин Владимир Владимирови","5",47000));
    }

}


