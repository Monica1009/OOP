package com.company.Bloc;

import com.company.gestiuneproduse.Produs;
import com.company.gestiunetelefoane.Contact;
import com.company.gestiunetelefoane.Telefon;
/*Bloc - nume bloc
Etaj - numar etaj
Apartament - numar apartament
- nume familie

Construiti functionalitatea pe baza scenariului de test de mai jos:

Scenariu de test:

Bloc bloc = new Bloc("E2");
Etaj etajul0 = new Etaj(0);
Apartament ap1 = new Apartanmet(1, "fam Ionescu");
etajul0.adaugaApartament(ap1);
Apartament ap2 = new Apartanmet(2, "fam Popescu");
etajul0.adaugaApartament(ap2);
bloc.adaugaEtaj(etajul0);
bloc.afiseazaBloc();
Afiseaza pe ecran :
 et-0:||1. fam Ionescu || ||2. fam Popescu||*/

public class Main {
    public static void main(String[] args) {

       Bloc bloc= new Bloc("E2");
       Etaj etajul0= new Etaj(0);
       Apartament ap1= new Apartament(1, "fam Ionescu");
       etajul0.adaugaApartament(ap1);
       Apartament ap2= new Apartament(2, "fam Popescu");
       etajul0.adaugaApartament(ap2);
       bloc.adaugaEtaj(etajul0);


        Etaj etajul1 = new Etaj(1);
        Apartament ap3 = new Apartament(3, "fam Georgescu");
        etajul1.adaugaApartament(ap3);
        Apartament ap4 = new Apartament(4, "fam Vladimirescu");
        etajul1.adaugaApartament(ap4);
        Apartament ap5 = new Apartament(5, "fam Tutulescu");
        etajul1.adaugaApartament(ap5);
        bloc.adaugaEtaj(etajul1);
        bloc.afiseazaBloc();


    }




}
