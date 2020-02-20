package com.dp.adapter;

public class Adapter extends OldImpl implements Standard {

    //private OldImpl old = new OldImpl();

    @Override
    public void operation(int nb1, int nb2) {
        int res = (int) this.calc(nb1, nb2);
        this.print((int) res);
    }
}
