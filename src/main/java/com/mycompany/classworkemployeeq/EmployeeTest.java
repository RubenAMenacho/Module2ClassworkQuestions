/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classworkemployeeq;

/**
 *
 * @author ramlifting
 */
    public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ruben", "Menacho", 5000);
        Employee e2 = new Employee("John", "Doe", 6000);
        
        System.out.println("Employee 1: " + e1.getFirstName() + " " + e1.getLastName());
        System.out.println("Yearly salary: $" + e1.getMonthlySalary() * 12);
        
        System.out.println("Employee 2: " + e2.getFirstName() + " " + e2.getLastName());
        System.out.println("Yearly salary: $" + e2.getMonthlySalary() * 12);
        
        System.out.println("\nGiving employees a 10% raise...\n");
        
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.1);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.1);
        
        System.out.println("Employee 1: " + e1.getFirstName() + " " + e1.getLastName());
        System.out.println("Yearly salary: $" + e1.getMonthlySalary() * 12);
        
        System.out.println("Employee 2: " + e2.getFirstName() + " " + e2.getLastName());
        System.out.println("Yearly salary: $" + e2.getMonthlySalary() * 12);
    }
}

