package com.example.homework28;

public class Employee {

    private String fullName;
    private String department;
    private  int salary;


    public Employee(String fullName, String department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return
                ", Имя сотрудника = " + fullName + '\'' +
                        ", отдел = " + department +
                        ", зарплата = " + salary + " рублей";


    }

}
