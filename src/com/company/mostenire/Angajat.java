package com.company.mostenire;

public class Angajat extends Persoana{

    private String birou;
    private int salariu;
    private MyDate dataAngajarii;

    public Angajat(){

    }

    @Override
    public String toString() {
        System.out.println("Angajat" + this.getNume());
        return " ";

    }

    public Angajat(String nume, String adresa, String nrTel, String adresaEmail, String birou, int salariu, MyDate dataAngajarii) {
        super(nume, adresa, nrTel, adresaEmail);
        this.birou = birou;
        this.salariu = salariu;
        this.dataAngajarii = dataAngajarii;
    }

    public Angajat(String birou, int salariu, MyDate dataAngajarii) {
        this.birou = birou;
        this.salariu = salariu;
        this.dataAngajarii = dataAngajarii;
    }

    public String getBirou() {
        return birou;
    }

    public void setBirou(String birou) {
        this.birou = birou;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public MyDate getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(MyDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }
}
