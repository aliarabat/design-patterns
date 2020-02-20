package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }


    @Override
    public void view() {
        String tab=this.identation();
        System.out.println(tab+"Folder : " + name);
        for (int i=0; i<components.size(); i++) {
            components.get(i).view();
        }
    }

    public Component addComponent(Component component) {
        component.level = this.level + 1;
        this.components.add(component);
        return component;
    }
}
