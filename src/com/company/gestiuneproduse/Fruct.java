package com.company.gestiuneproduse;

public class Fruct extends Produs {

    private boolean bio= false;

    public Fruct(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    @Override
    public String getCategory() {
        return "Fructe";
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }
}
