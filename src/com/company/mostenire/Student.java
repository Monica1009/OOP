package com.company.mostenire;

public class Student extends Persoana{

    @Override
    public String toString() {
        System.out.println("Student" + this.getNume());
        return " ";

    }

    private Statut statut;

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}
