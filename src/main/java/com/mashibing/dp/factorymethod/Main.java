package com.mashibing.dp.factorymethod;

public class Main {
    public static void main(String[] args) {

        MoveableFactory moveableFactory = new CarFactory();
        Moveable moveable = moveableFactory.create();

        moveable.go();
    }
}
