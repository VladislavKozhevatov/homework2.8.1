package com.example.homework28;

public class Employee {

    private String fullName;
    private int department;
    private  int salary;


    public Employee (String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    public int getDepartment() {
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
