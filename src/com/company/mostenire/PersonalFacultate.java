package com.company.mostenire;

public class PersonalFacultate extends Angajat{

    @Override
    public String toString() {
        System.out.println("PersonalFacultate" + this.getNume());
        return " ";

    }

    private String titlu;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}
