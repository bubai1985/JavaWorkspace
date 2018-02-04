package com.example.factorydesignpattern;

public class IOS implements OS {
    @Override
    public void getType() {
        System.out.println("I am in IOS");
    }
}
