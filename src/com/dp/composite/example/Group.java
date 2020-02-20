package com.dp.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Group extends Component {

    private List<Component> components = new ArrayList<>();

    public Group(String name) {
        super(name);
    }

    @Override
    public void view() {
        String tab = indentation();
        System.out.println(tab + "Group : " + name);
        for (int i = 0; i < components.size(); i++) {
            components.get(i).view();
        }
    }

    public Component addComponent(Component component) {
        component.level = this.level + 1;
        this.components.add(component);
        return component;
    }

    public Component getFirstChild() {
        return this.components.size() > 0 ? this.components.get(0) : null;
    }

    public Component getLastChild() {
        return this.components.size() > 0 ? this.components.get(this.components.size() - 1) : null;
    }

    public List<Component> getChildren() {
        return components;
    }


}
