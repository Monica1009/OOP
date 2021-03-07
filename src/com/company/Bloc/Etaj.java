package com.company.Bloc;

import com.company.gestiunetelefoane.Contact;

public class Etaj {

    private int numarEtaj;
    private Apartament[] apartamente= new Apartament[10];
    private int index=0;


    public Apartament[] getApartamente() {
        return apartamente;
    }

    public void setApartamente(Apartament[] apartamente) {
        this.apartamente = apartamente;
    }

    public Etaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }

    public int getNumarEtaj() {
        return numarEtaj;
    }

    public void setNumarEtaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }

    public void adaugaApartament(Apartament apartamentNou) {
        this.apartamente[index] = apartamentNou;
        this.index++;
    }

}
