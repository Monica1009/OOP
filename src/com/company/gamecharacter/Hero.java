package com.company.gamecharacter;

public class Hero extends Erou {
    public Hero(int viata, int putereDeAtac) {
        super(viata, putereDeAtac);
    }

    @Override
    public void atack(Erou e) {
        e.decreaseLife(this.getPutereDeAtac());

    }

    @Override
    public void decreaseLife(int value) {
        int calculViataRamasa= this.getViata()- value;
        this.setViata(calculViataRamasa);
    }
}
