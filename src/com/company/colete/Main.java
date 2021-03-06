package com.company.colete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /* Colet colet = new Colet("12A", "Ionescu Gabriel", "Strada Parcului");
        List<Colet> colete= new ArrayList<>();
        colete.add(colet);
        FileObjectWriter fileObjectWriter= new FileObjectWriter();
        fileObjectWriter.writeObject(colete);

        List<Colet> coleteCititte= fileObjectWriter.citesteColete();
        for(Colet coletCitit: coleteCititte){
            System.out.println(coletCitit.getId()+ coletCitit.getDestinatar());
        }
    } */

        Scanner scanner = new Scanner(System.in);
        int optiune = -1;
        while (optiune != 3) {
            System.out.println("1. Adaugare colet");
            System.out.println("2. Afisare colet");
            System.out.println("3. Exit");
            optiune = scanner.nextInt();
            scanner.nextLine();
            FileObjectWriter fileObjectWriter = new FileObjectWriter();
            if (optiune == 1) {
                System.out.println("Introduceti id-ul coletului: ");
                String id= scanner.nextLine();
                System.out.println(" Introduceti destinatarul coletului: ");
                String nume= scanner.nextLine();
                System.out.println("Introduceti adresa coletului: ");
                String adresa= scanner.nextLine();
                Colet colet= new Colet (id, nume, adresa);

                List<Colet> coleteDinFisier= fileObjectWriter.citesteColete();
                coleteDinFisier.add(colet);
                fileObjectWriter.writeObject(coleteDinFisier);
            }
            if(optiune==2){
                List<Colet> colete= fileObjectWriter.citesteColete();
                for(Colet colet: colete){
                    System.out.println(colet.getId()+ " "+ colet.getAdresa()+ " " + colet.getDestinatar());
                }
            }
        }
    }
}



