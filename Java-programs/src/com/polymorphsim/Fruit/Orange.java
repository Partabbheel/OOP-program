package com.polymorphsim.Fruit;

public class Orange extends Fruit{
    @Override
    void eat(){
        System.out.println(super.getName()+" Juicing");
    }
}
