package com.dp.adapter;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandard(new StandardImpl1());
        client.process(4, 5);
        client.setStandard(new StandardImpl2());
        client.process(4, 5);

        client.setStandard(new Adapter());
        client.process(9,2);
    }
}
