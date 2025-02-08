package com.polymorphsim.Fruit;

public class Fruit {
    private String name;

    void eat(){
        System.out.println("Eating");
    }

   public String getName() {
        return name;
   }

    public void setName(String name) {
        this.name = name;
    }
}
