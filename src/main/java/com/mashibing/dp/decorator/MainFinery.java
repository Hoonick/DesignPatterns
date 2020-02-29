package com.mashibing.dp.decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class MainFinery {
    public static void main(String[] args) throws Exception {

        Person person = new Person("小菜");

        Sneaker sneaker = new Sneaker();
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);
        sneaker.decorate(tShirts);
        sneaker.show();
    }
}
