package com.company.Bloc;

public class Bloc {

    private String numeBloc;
    private Etaj[] etaje = new Etaj[10];
    private int index;

    public Bloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public void adaugaEtaj(Etaj etajNou) {
        this.etaje[index] = etajNou;
        this.index++;
    }
    /*et-0:||1. fam Ionescu || ||2. fam Popescu||*/

    public void afiseazaBloc() {
        for (int i = 0; i < etaje.length; i++) {
            Etaj etajCurent = etaje[i];
            if (etajCurent != null) {
                System.out.print("et-" + etajCurent.getNumarEtaj());
                Apartament[] apartamenteEtajulCurent = etajCurent.getApartamente();
                for (int j = 0; j < apartamenteEtajulCurent.length; j++) {
                    Apartament apartamentCurent= apartamenteEtajulCurent[j];
                    if (apartamentCurent!= null) {
                        System.out.print("||" + apartamenteEtajulCurent[j].getNumarApartament() + ". " + apartamenteEtajulCurent[j].getNumeFamilie() + " || ");
                    }
                }
                System.out.println(" ");
            }
        }
    }

}
