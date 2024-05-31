package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.payroll;

import java.util.List;
import java.util.ArrayList;

public class PayrollBad {
    private List<Employee> employees;

    public PayrollBad() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
            System.out.println("Employee added: " + employee.getName());
        } else {
            System.out.println("Failed to add employee: " + employee.getName());
        }
    }

    public double calculateMonthlySalary(Employee employee) {
        if (employee != null) {
            double baseSalary = employee.getBaseSalary();
            double overtime = employee.getOvertimeHours();
            double overtimeRate = 1.5;
            double deductions = employee.getDeductions();
            double monthlySalary = (baseSalary + (overtime * overtimeRate)) - deductions;
            return monthlySalary;
        } else {
            System.out.println("Invalid employee.");
            return 0.0;
        }
    }

    public void printEmployeeSalary(Employee employee) {
        if (employee != null) {
            double monthlySalary = calculateMonthlySalary(employee);
            System.out.println("Monthly Salary for " + employee.getName() + ": " + monthlySalary);
        } else {
            System.out.println("Invalid employee.");
        }
    }


}

