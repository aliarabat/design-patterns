package com.dp.composite.example;
import com.dp.composite.example.Component;

public class User extends Component {
    public User(String name) {
        super(name);
    }


    @Override
    public void view() {
        String tab = indentation();
        System.out.println(tab + "User : " + name);
    }
}
