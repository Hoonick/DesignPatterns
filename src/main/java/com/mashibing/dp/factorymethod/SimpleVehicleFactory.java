package com.mashibing.dp.factorymethod;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {


    Moveable getMoveable(String name) {

        if (name == null) {
            return null;
        }

        switch (name) {
            case "car":
                return new Car();
            case "broom":
                return new Broom();
        }
        return null;
    }
}
