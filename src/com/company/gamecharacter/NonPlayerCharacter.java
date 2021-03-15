package com.company.gamecharacter;

public class NonPlayerCharacter extends Erou {

    public NonPlayerCharacter(int viata, int putereDeAtac) {
        super(viata, putereDeAtac);
    }

    @Override
    public void atack(Erou e) {
        System.out.println("O sa te atac");
        e.decreaseLife(this.getPutereDeAtac());
    }

    @Override
    public void decreaseLife(int value) {
        int calculViataRamasa= this.getViata()- value;
        this.setViata(calculViataRamasa);
    }
}
