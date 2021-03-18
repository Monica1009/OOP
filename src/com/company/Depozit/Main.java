package com.company.Depozit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Colet colet1= new Colet("Strada Parcului");
        Colet colet2= new Colet("Strada Anghelescu");
        Colet colet3= new Colet("strada Iordanescu");
        Colet colet4= new Colet ("Strada Vladimirescu");

        Map<String, ArrayList<Colet>> depositul= new HashMap<>();
        ArrayList<Colet> coleteDin1A= new ArrayList<>();
        coleteDin1A.add(colet1);
        coleteDin1A.add(colet2);
        depositul.put("1A",coleteDin1A);

        ArrayList<Colet> coletedin1B = new ArrayList<>();
        coletedin1B.add(colet3);
        coletedin1B.add(colet4);

        depositul.put("1B", coletedin1B);

        ArrayList<Colet> coleteDeLa1B= depositul.get("1B");
        for(Colet colet: coleteDeLa1B){
            System.out.println(colet.getAdresa());
        }

    }
}
