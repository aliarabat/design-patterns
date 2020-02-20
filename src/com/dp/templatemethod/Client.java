package com.dp.templatemethod;

import com.dp.templatemethod.mt.TemplateClass;
import com.dp.templatemethod.mt.TemplateImpl1;
import com.dp.templatemethod.mt.TemplateImpl2;

public class Client {
    public static void main(String[] args) {
        /*Le pattern strategy permet de faire d'evouluer le comprtement d'une methode d'une manière dynamique au
        moment de l'éxecution
         */
        TemplateClass templateClass1 = new TemplateImpl1();
        System.out.println(templateClass1.templateMethod());
        templateClass1 = new TemplateImpl2();
        System.out.println(templateClass1.templateMethod());


    }
}
