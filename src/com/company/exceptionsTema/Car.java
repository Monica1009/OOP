package com.company.exceptionsTema;

public class Car {

    private int viteza;

    public int getViteza() {
        return viteza;
    }

    public void setViteza (int viteza) throws CarCrashException {
        if(viteza> 400){
            CarCrashException carCrashException= new CarCrashException();
            throw carCrashException;
        }
        this.viteza = viteza;
    }
}
