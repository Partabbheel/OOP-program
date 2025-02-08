package com.polymorphsim.Fruit;

public class Test {
    public static void main(String[] args){
        Fruit f = new Fruit();
        f.eat();
        Apple a= new Apple();
        a.setName("Apple");
        a.eat();
        Banana b= new Banana();
        b.setName("Banana");
        b.eat();
        Orange o =new Orange();
        o.setName("Orange");
        o.eat();

    }
}
