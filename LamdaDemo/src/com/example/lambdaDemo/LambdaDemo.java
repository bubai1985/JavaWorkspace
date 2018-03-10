package com.example.lambdaDemo;

public class LambdaDemo {
    public static void main(String[] args) {
//        PrintData printData = new PrintData() {
//            @Override
//            public void print() {
//                System.out.println("Hello World");
//            }
//        };

      //  Temp temp = new Temp();
        //printData.print();
        PrintData printData = ()-> {System.out.println("Hello World");};
        printData.print();

    }
}
