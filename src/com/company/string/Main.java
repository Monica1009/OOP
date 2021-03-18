package com.company.string;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.nextLine();
        String cuvantModificat = cuvant.toLowerCase();
        String cuvantModificat1 = cuvant.toUpperCase();
        String cuvantModificat2 = cuvant.trim();
        String cuv = cuvant.replace("a", "c");


        int index = cuvant.indexOf("a");
        String substring = cuvant.substring(2, 4);
        // Gabriel
        //0123456   br
        System.out.println(cuvantModificat);
        System.out.println(cuvantModificat1);
        System.out.println(cuv);

        String propozitie = scanner.nextLine();
        int endIndex = propozitie.lastIndexOf(".");
        int startIndex = propozitie.lastIndexOf(" ") + 1;
        String cuvant34 = propozitie.substring(startIndex, endIndex);
        System.out.println("Ultimul cuvant este: " + cuvant34);

        String[] cuvinte = propozitie.split(" ");
        for (String cuv1 : cuvinte) {
            System.out.println(cuv1);
         if(cuv.contains(".")){
             cuv1= cuv1.replace(".", "");
         }

            System.out.println(cuv1);
        }
    }
}
