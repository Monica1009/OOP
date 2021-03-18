package com.company.gestiuneproduse;

public class Dulciuri extends Produs {

    private int gramaj;

    public Dulciuri(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    @Override
    public String getCategory() {
        return "Dulciuri";
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }
}
