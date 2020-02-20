package com.dp.templatemethod.mt;

public class TemplateImpl2 extends TemplateClass {
    @Override
    protected int operation1() {
        return 12;
    }

    @Override
    protected double operation2(int i) {
        return i * i;
    }
}
