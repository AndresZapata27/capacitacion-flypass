package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }
}

public class AverageSalaryByDepartmentExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 75000.0),
                new Employee("Bob", "Engineering", 82000.0),
                new Employee("Charlie", "HR", 60000.0),
                new Employee("David", "HR", 64000.0),
                new Employee("Eve", "Marketing", 70000.0),
                new Employee("Frank", "Marketing", 72000.0)
        );

        // Agrupar empleados por departamento y calcular el promedio de sus salarios
        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        averageSalaryByDepartment.forEach((department, avgSalary) -> 
                System.out.println("Department: " + department + ", Average Salary: " + avgSalary));
    }
}
