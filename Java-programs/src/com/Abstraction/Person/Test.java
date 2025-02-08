package com.Abstraction.Person;

public class Test {
    public static void main(String[] args) {
        Person student = new Student();
        System.out.println("Student Information");
        student.setName("Asslam");
        student.setAge(19);
        student.displayInfo();
        student.job();
        System.out.println();

        Person doctor = new Doctor();
        System.out.println("Doctor Information");
        doctor.setName("Abdul Aziz");
        doctor.setAge(29);
        doctor.displayInfo();
        doctor.job();
        System.out.println();

        Person engineer = new Engineer();
        System.out.println("Engineer Information");
        engineer.setName("Parviz");
        engineer.setAge(28);
        engineer.displayInfo();
        engineer.job();
    }
}


