package com.company.tamaClasa;

public class Main {
    public static void main(String[] args) {

        Cerc cerc= new Cerc();
        cerc.setRaza(12);
        calculeazaRaza(cerc);
        System.out.println("Aria cercului este: " +  calculeazaRaza(cerc));
    }


    public static double calculeazaRaza(Cerc cerc){
        double raza= cerc.getRaza();
        double aria= 3.14 * (raza*raza);
        return aria;

    }
}
