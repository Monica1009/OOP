package com.company.abstractex;

public class Dreptunghi implements FormaGeometrica, Desenabil, Construibil{

    private double lat;
    private double lun;

    public double getLun() {
        return lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public double calculateArea() {
        return lun * lat;
    }

    @Override
    public double calculatePerimeter() {
        return 2*lat + 2 * lun;
    }

    @Override
    public void deseneaza(String color) {
        System.out.println("se deseneaza dreptunghiul cu culoarea " + color);
    }

    @Override
    public void construieste(String nume) {
        System.out.println("se construieste dreptunghiul "+ nume);
    }
}
