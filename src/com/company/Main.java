package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to city of sin!");

        Krupier krupier = new Krupier();
        Reka reka= new Reka();

        double hajsgracza = 100.0;

        Plansza plansza = new Plansza();

        plansza.setdeck();

        System.out.println(plansza);




    }
}
