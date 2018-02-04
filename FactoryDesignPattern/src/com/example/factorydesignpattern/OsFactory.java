package com.example.factorydesignpattern;

public class OsFactory {
    public OS getOS(Type type) {
        OS os = null;
        switch (type) {
            case Android:
                os = new Andriod();
                break;
            case IOS:
                os = new IOS();
                break;
            case Windows:
                os = new Windows();
                break;
                default:
                    break;
        }

        return os;
    }
}
