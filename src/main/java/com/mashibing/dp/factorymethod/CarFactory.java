package com.mashibing.dp.factorymethod;

public class CarFactory implements MoveableFactory{
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
