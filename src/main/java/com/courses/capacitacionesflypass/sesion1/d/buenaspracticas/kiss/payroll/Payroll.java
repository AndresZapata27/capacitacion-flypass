package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.payroll;

import java.util.List;
import java.util.ArrayList;

public class Payroll {
    private List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (isValidEmployee(employee) && !employees.contains(employee)) {
            employees.add(employee);
            System.out.println("Employee added: " + employee.getName());
        } else {
            System.out.println("Failed to add employee: " + employee.getName());
        }
    }

    //KISS Extraer logica compleja en metodos bien nombrados y entendibles,
    // y que tengan facil mantenimiento, pensado en los cambios que nos pida negocio

    public double calculateMonthlySalary(Employee employee) {
        if (isValidEmployee(employee)) {
            return calculateBaseSalary(employee)
                    + calculateOvertimePay(employee) - employee.getDeductions();
        } else {
            System.out.println("Invalid employee.");
            return 0.0;
        }
    }

    private double calculateBaseSalary(Employee employee) {
        return employee.getBaseSalary();
    }

    private double calculateOvertimePay(Employee employee) {
        double overtimeRate = 1.5;
        return employee.getOvertimeHours() * overtimeRate;
    }

    private boolean isValidEmployee(Employee employee) {
        return employee != null;
    }

    public void printEmployeeSalary(Employee employee) {
        if (isValidEmployee(employee)) {
            double monthlySalary = calculateMonthlySalary(employee);
            System.out.println("Monthly Salary for " + employee.getName() + ": " + monthlySalary);
        } else {
            System.out.println("Invalid employee.");
        }
    }


}