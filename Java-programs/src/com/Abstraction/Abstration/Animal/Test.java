package com.Abstraction.Abstration.Animal;

public class Test {
    public static void main(String[] args){
        Animal  cow= new Cow();
        Animal dog = new Dog();
        Animal cat = new Cat();

        cow.AnimalSound();
        dog.AnimalSound();
        cat.AnimalSound();
    }

}
