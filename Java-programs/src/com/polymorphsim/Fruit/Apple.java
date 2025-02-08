package com.polymorphsim.Fruit;

public class Apple extends Fruit {
    @Override
    void eat(){
        System.out.println(super.getName()+" Biting into a crunchy");
    }
}
