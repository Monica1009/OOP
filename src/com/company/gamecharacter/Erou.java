package com.company.gamecharacter;

public abstract class Erou implements Atacabil {

    private int viata;
    private int putereDeAtac;

    public Erou(int viata, int putereDeAtac) {
        this.viata = viata;
        this.putereDeAtac = putereDeAtac;
    }

    public int getViata() {
        return viata;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

    public int getPutereDeAtac() {
        return putereDeAtac;
    }

    public void setPutereDeAtac(int putereDeAtac) {
        this.putereDeAtac = putereDeAtac;
    }

    public abstract void atack(Erou e);

}
