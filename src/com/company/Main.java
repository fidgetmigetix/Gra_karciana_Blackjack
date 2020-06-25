package com.company;

import java.util.Scanner;

// prosta aplikacja do grania w blackjacka


public class Main {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to city of sin!");

        Talia krupier= new Talia();
        System.out.println("Write ur name");
        String name= scanner.nextLine();
        System.out.println("Hello " + name+ " my man");

        Reka reka= new Reka(name);

        Talia talia = new Talia();

        talia.setdeck();
        talia.ustaw();


        System.out.println(talia);
        double hajs= reka.getHajs();

        while(hajs>0){

            System.out.println("Masz " + hajs + "$");
            System.out.println("Ile chcesz postawic?");

            double bet = scanner.nextDouble();

            if(hajs<bet){
                System.out.println("Nie mozesz tyle postawic, bo nie masz tyle pieniedzy");
                break;
            }

            boolean koniecrundy= false;

            reka.wybierzKarte(talia);
            reka.wybierzKarte(talia);

            krupier.wybierzKarte(talia);
            krupier.wybierzKarte(talia);

            while(true) {
                System.out.println("Twoja reka: ");
                System.out.println(reka.toString());
                System.out.println("Twoja reka ma wartosc: " + reka.wartosci());

                System.out.println("Krupier ma: " + krupier.wezKarte(0).toString() + " i jedna nieznana");
                System.out.println("Wartosc kart krupiera to: " + krupier.wartosci());

                System.out.println("Chcesz dobrac[1] czy zostac[2]? ");
                scanner.nextLine();
                int odp = scanner.nextInt();

                if (odp == 1) {
                    reka.wybierzKarte(talia);
                    System.out.println("Dostales : " + reka.wezKarte(reka.Size() - 1).toString());
                    System.out.println("Twoja reka ma wartosc: " + reka.wartosci());
                    if (reka.wartosci() > 21) {
                        System.out.println("Twoja suma kart wynosi teraz wiecej niz 21");
                        hajs -= bet;
                        koniecrundy = true;
                        break;
                    }

                } else if (odp == 2) {
                    break;
                }
            }

                System.out.println("Karty Krupiera: " + krupier.toString());

                if(krupier.wartosci()> reka.wartosci() && koniecrundy==false){
                    System.out.println("Pokonano Cie!");
                    hajs-=bet;
                    koniecrundy=true;
                }

                while(krupier.wartosci()<=16 && koniecrundy==false){
                    krupier.wybierzKarte(talia);
                    System.out.println("Krupier dobral: " + krupier.wartosci());
                }

                System.out.println("Reka Krupiera ma wartosc: "+ krupier.wartosci());

                if(krupier.wartosci() >21 && koniecrundy==false){
                    System.out.println("Krupier pokonany!");
                    hajs+=bet;
                    koniecrundy=true;
                }

                if(reka.wartosci() == krupier.wartosci() && koniecrundy==false){
                    System.out.println("Taką sama reke ma krupier i Ty");
                    koniecrundy=true;
                }

                if(reka.wartosci() > krupier.wartosci() && koniecrundy==false){
                    System.out.println("WYGRALES");
                    hajs+=bet;
                    koniecrundy=true;
                }else if(koniecrundy==false){
                    System.out.println("Krupier wygral");
                    hajs-=bet;
                    koniecrundy=true;
            }

                reka.wlozkarty(talia);
                krupier.wlozkarty(talia);
                System.out.println("Koniec kart");


        }
        System.out.println("Przegrales!!");


    }
}
