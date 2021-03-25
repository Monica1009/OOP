package com.company.exceptionsTema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int optiune = 0;
        while (optiune != -1) {
            try {
                int viteza;
                System.out.println("Introduceti viteza: ");
                viteza = scanner.nextInt();
                Car car = new Car();
                car.setViteza(viteza);
            } catch (CarCrashException carCrashException) {
                System.out.println("Masina poate face accident!");
            }
        }
    }


}
