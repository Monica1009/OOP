package com.company.travelagency;

import java.util.ArrayList;

public class City {

    private String name;
    private String decsriere;
    private ArrayList<Aeroport> airports= new ArrayList<>();
    private ArrayList<Hotel> hotels= new ArrayList<Hotel>();



    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<Aeroport> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<Aeroport> airports) {
        this.airports = airports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecsriere() {
        return decsriere;
    }

    public void setDecsriere(String decsriere) {
        this.decsriere = decsriere;
    }

    public void display(){
        System.out.println(name);
        for(int i=0; i< airports.size(); i++){
            Aeroport airport= airports.get(i);
            airport.display();
        }

        System.out.println("Hotels: ");
        for(int i=0; i< hotels.size(); i++){
            Hotel hotel = hotels.get(i);
            hotel.display();
        }
    }
}
