package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Talia {

    private ArrayList<Karta> cards;

    public Talia() {
        this.cards = new ArrayList<Karta>();
    }

    public void wybierzKarte(Talia deck){
        this.cards.add(deck.wezKarte(0));
        deck.remove(0);

    }

    public int Size(){
        return this.cards.size();
    }

    public void ustaw(){
        ArrayList<Karta> tymcz = new ArrayList<>();
        Random random = new Random();

        int obecny= 0;
        for(int i=0; i<this.cards.size(); i++){

            obecny = random.nextInt((cards.size()-1)+1);
            tymcz.add(cards.get(obecny));
            cards.remove(obecny);

        }
        cards= tymcz;
    }

    public void remove(int i){
        this.cards.remove(i);
    }

    public Karta wezKarte(int i){
        return cards.get(i);
    }

    public void dodaj(Karta k){
        this.cards.add(k);
    }

    public void setdeck(){
        for(Rodzaj cardsuit: Rodzaj.values() ){
            for(Wartosc cardvalue : Wartosc.values()){
                cards.add(new Karta(cardsuit, cardvalue));
            }
        }
    }

    public void wlozkarty(Talia p){
        int decksize = this.cards.size();

        for(int i =0; i<decksize; i++){
            p.dodaj(this.wezKarte(i));
        }

        for(int i=0 ; i< decksize; i++){
            this.remove(0);
        }
    }

    @Override
    public String toString() {
        String karty= "";
        for(int i=0; i < this.cards.size(); i++){
            Karta karta = cards.get(i);
            karty+= i + " "+  karta.toString() + "\n";
        }
        return karty;
    }

    public int wartosci(){
        int suma=0;
        int asy=0;

        for(Karta karta : this.cards){
            switch(karta.getValue()){
                case TWO: suma+=2;break;
                case THREE: suma+=3; break;
                case FOUR: suma+=4; break;
                case FIVE: suma+=5; break;
                case SIX: suma+=6; break;
                case SEVEN: suma+=7; break;
                case EIGHT: suma+=8; break;
                case NINE: suma+=9; break;
                case TEN: suma+=10;break;
                case JACK: suma+=10; break;
                case QUENN: suma+=10; break;
                case ACE: asy+=1; break;
            }

            for(int i=0; i<asy; i++){
                if(suma>10){
                    suma+=1;
                } else
                    suma+=11;
            }
        }
        return suma;
    }





}
