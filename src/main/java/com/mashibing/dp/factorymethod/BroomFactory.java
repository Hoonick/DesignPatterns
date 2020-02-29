package com.mashibing.dp.factorymethod;

public class BroomFactory  implements MoveableFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Broom();
    }
}
