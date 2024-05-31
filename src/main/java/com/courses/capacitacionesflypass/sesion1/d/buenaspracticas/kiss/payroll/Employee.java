package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.payroll;

public class Employee {
    private String name;
    private double baseSalary;
    private double overtimeHours;
    private double deductions;

    public Employee(String name, double baseSalary, double overtimeHours, double deductions) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.deductions = deductions;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public double getDeductions() {
        return deductions;
    }
}
