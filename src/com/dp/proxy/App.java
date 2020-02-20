package com.dp.proxy;

public class App {
    public static void main(String[] args) {
        Client client=new Client();
        client.setStandard(new Proxy());
        client.process();
    }
}
