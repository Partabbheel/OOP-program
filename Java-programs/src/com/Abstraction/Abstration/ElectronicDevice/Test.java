package com.Abstraction.Abstration.ElectronicDevice;

public class Test {
    public static void main(String[] args){
                ElectronicDevice laptop = new Laptop();
                System.out.println("Laptop Detail");
                laptop.setBrand("HP");
                laptop.setPrice(32000);
                laptop.displayInfo();
                laptop.usage();
                System.out.println();


                ElectronicDevice mobile = new Mobile();
                System.out.println("Mobile Details");
                mobile.setBrand("HP");
                mobile.setPrice(32000);
                mobile.displayInfo();
                mobile.usage();
                System.out.println();


                ElectronicDevice computer = new Calculator();
                System.out.println("Computer Details");
                computer.setBrand("Casio");
                computer.setPrice(5700);
                computer.displayInfo();
                computer.usage();
                System.out.println();
    }
}


