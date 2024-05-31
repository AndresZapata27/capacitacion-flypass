package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.payroll;

public class MainPayroll {

    public static void main(String[] args) {


        Employee emp1 = new Employee("John Doe", 3000, 10, 200);


        PayrollBad payrollBad = new PayrollBad();
        payrollBad.addEmployee(emp1);
        payrollBad.printEmployeeSalary(emp1);



        Payroll payroll = new Payroll();
        payroll.addEmployee(emp1);
        payroll.printEmployeeSalary(emp1);
    }
}
