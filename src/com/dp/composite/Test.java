package com.dp.composite;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        Folder f1 = new Folder("Structure");
        Folder f2 = new Folder("Behavior");
        Folder f3 = new Folder("Creation");
        root.addComponent(f1);
        root.addComponent(f2);
        root.addComponent(f3);

        f1.addComponent(new File("Composite"));
        f1.addComponent(new File("Decorator"));

        f2.addComponent(new File("Strategy"));

        f3.addComponent(new File("Singleton"));
        f3.addComponent(new File("Builder"));

        Folder fStr1 = (Folder) f1.addComponent(new Folder("St1"));
        fStr1.addComponent(new File("Composite version 2"));

        root.view();

    }
}
