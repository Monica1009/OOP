package com.company.gestiuneproduse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int optiune=-1;

        Produs[] produse= new Produs[100];
        int index=0;

        while(optiune!=0){
            System.out.println("1. Adauga fructe");
            System.out.println("2. Adauga dulciuri");
            System.out.println("3. Adauga haine");
            System.out.println("4. Afiseaza produsele disponibile");
            System.out.println("0. Exit");
            System.out.println("Introduceti o optiune: ");
            optiune= scanner.nextInt();
            scanner.nextLine();
            if(optiune==1 || optiune==2 || optiune==3){
            System.out.println("Introduceti numele produsului: ");
            String name= scanner.nextLine();
            System.out.println("Introduceti pretul produsului: ");
            double pret= scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduceti numele producatorului: ");
            String producatorul= scanner.nextLine();
            if(optiune==1){
                System.out.println("Este fructul bio? (y/n)");
                String esteBio= scanner.nextLine();
                boolean isBio= false;
                if(esteBio.equals("y")){
                    isBio= true;
                }
                Fruct fruct= new Fruct(name, pret, producatorul);
                        fruct.setBio(isBio);
                        produse[index]= fruct;
                        index++;

            }

            if(optiune==2){
                System.out.println("Introduceti gramajul: ");
                int gramaj= scanner.nextInt();
                scanner.nextLine();
                Dulciuri dulciuri = new Dulciuri(name, pret, producatorul);
                dulciuri.setGramaj(gramaj);
                produse[index]= dulciuri;
                index++;
            }

            if(optiune==3){
                System.out.println("Introduceti marimea: ");
                String marime= scanner.nextLine();
                scanner.nextLine();
                Haine haine= new Haine(name, pret, producatorul);
                haine.setMarime(marime);
                produse[index]= haine;
                index++;
            }

            }
            if(optiune==4){
                afisareProduse(produse);

            }
        }
    }

    public static void afisareProduse(Produs[] produse){
        for (int i=0; i< produse.length; i++){
            Produs produs= produse[i];
            if(produs!=null){
                String name= produs.getName();
                double pret= produs.getPret();
                String producatorul= produs.getProducator();
                System.out.println(name+ "pet: "+ pret + " lei" + " producator" + producatorul);

                if(produs instanceof Fruct){
                    Fruct fruct= (Fruct) produs;
                    System.out.println("Fructul este: " + fruct.isBio());
                }
                if(produs instanceof Haine){
                    Haine haine= (Haine) produs;
                    System.out.println("Haina are marimea: " + haine.getMarime());
                }
                if(produs instanceof Dulciuri){
                    Dulciuri dulciuri=(Dulciuri)produs;
                    System.out.println("Dulciurile au gramajul" + dulciuri.getGramaj());
                }
            }
        }
    }
}
