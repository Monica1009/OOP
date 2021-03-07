package com.company.mostenire;

public class MembruFacultate extends Angajat{

    private int oreBirou;
    private String rang;

    @Override
    public String toString() {
        System.out.println("MembruFacultate" + this.getNume());
        return " ";

    }

    public int getOreBirou() {
        return oreBirou;
    }

    public void setOreBirou(int oreBirou) {
        this.oreBirou = oreBirou;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
