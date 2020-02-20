package com.dp.decorator;

import com.dp.decorator.decorators.Caramel;
import com.dp.decorator.decorators.Chocolat;

public class Test {

	public static void main(String[] args) {
        Boisson boisson = new Espresso();
        System.out.println("*******************");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("*******************");
        boisson = new Chocolat(boisson);
        System.out.println("*******************");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("*******************");

        boisson = new Caramel(boisson);
        System.out.println("*******************");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.count());
        System.out.println("*******************");
    }

}
