package com.mashibing.dp.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    public  void show() {
        System.out.print("  ,装扮者name="+ name);
    }

}
