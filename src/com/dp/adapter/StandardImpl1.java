package com.dp.adapter;

public class StandardImpl1 implements Standard{
    public void operation(int nb1, int nb2){
        double res=nb1*nb2;
        System.out.println("*********************");
        System.out.println("****Implémentation Standard 1");
        System.out.println("******* Res : "+res+" ********");
        System.out.println("*********************");
    }
}
