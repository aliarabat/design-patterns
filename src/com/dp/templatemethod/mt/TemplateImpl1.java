package com.dp.templatemethod.mt;

public class TemplateImpl1 extends TemplateClass {
    @Override
    protected int operation1() {
        return 10;
    }

    @Override
    protected double operation2(int i) {
        return i * i;
    }
}
