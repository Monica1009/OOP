package com.company.abstractex;

public class Car implements Desenabil {

    private String color;

    @Override
    public void deseneaza(String color) {
        System.out.println("se deseneaza masina");
    }
}
