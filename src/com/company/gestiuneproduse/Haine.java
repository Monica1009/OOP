package com.company.gestiuneproduse;

public class Haine extends Produs {

    private String marime;

    public Haine(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    @Override
    public String getCategory() {
        return "Haine";
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    // Haina Nike


    @Override
    public String getName() {
        return "Haine- " + super.getName();
    }
}
