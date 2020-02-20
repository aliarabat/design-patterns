package com.dp.proxy;

import java.util.Random;

public class Proxy implements Standard {
    private StandardImpl1 target;

    @Override
    public void process() {
        System.out.println("Vérification du context de sécurité");
        boolean b = new Random().nextBoolean();
        if (b) {
            System.out.println("Before call");
            target = new StandardImpl1();
            target.process();
            System.out.println("After call");
        } else {
            throw new RuntimeException("Forbidden 403");
        }
    }


}
