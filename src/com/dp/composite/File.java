package com.dp.composite;

public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void view() {
        String tab=this.identation();
        System.out.println(tab+"File : " + name);
    }
}
