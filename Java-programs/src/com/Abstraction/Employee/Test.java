package com.Abstraction.Employee;

public class Test {
    public static void main(String[] args) {
        System.out.println("Manager Details");
        Employee manager = new Manager();
        manager.setName("Jaswant");
        manager.setDesignation("Manager");
        manager.setSalary(250000);
        manager.displayInfo();
        manager.jobDescription();
        System.out.println();


        System.out.println("Developer Details");
        Employee developer = new SoftwareEngineer();
        developer.setName("Parkash");
        developer.setDesignation("Developer");
        developer.setSalary(2010000);
        developer.displayInfo();
        developer.jobDescription();
        System.out.println();

    }
}

