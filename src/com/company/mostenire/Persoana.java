package com.company.mostenire;

public class Persoana {

    private String nume;
    private String adresa;
    private String nrTel;
    private String adresaEmail;

    public Persoana(String nume, String adresa, String nrTel, String adresaEmail) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTel = nrTel;
        this.adresaEmail = adresaEmail;
    }

    public Persoana(){

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }
}
