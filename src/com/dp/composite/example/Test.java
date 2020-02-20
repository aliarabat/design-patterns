package com.dp.composite.example;

import com.dp.composite.example.Component;
import com.dp.composite.example.Group;

public class Test {
    public static void main(String[] args) {
        Group root = new Group("Root");
        Group g1 = new Group("North");
        Group g2 = new Group("South");
        Group g3 = new Group("East");
        Group g4 = new Group("West");
        root.addComponent(g1);
        root.addComponent(g2);
        root.addComponent(g3);
        root.addComponent(g4);

        g1.addComponent(new User("Tanger"));
        g1.addComponent(new User("Tetouane"));
        g1.addComponent(new User("Houceima"));

        g2.addComponent(new User("Tata"));
        g2.addComponent(new User("Tantan"));

        root.addComponent(new User("Super User"));

        root.view();
    }
}
