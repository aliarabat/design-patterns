package com.dp.composite.example;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
    }

    public String indentation(){
        String str="";
        for (int i = 0; i < level; i++) {
            str+="\t";
        }
        return str;
    }

    public abstract void view();
}
