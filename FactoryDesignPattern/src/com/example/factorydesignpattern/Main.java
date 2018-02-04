package com.example.factorydesignpattern;

public class Main {
    public static void main(String[] atgs) {

        OS os = new OsFactory().getOS(Type.Android);
        os.getType();
    }
}
