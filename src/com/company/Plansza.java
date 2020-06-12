package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Plansza {

    private ArrayList<Karta> cards;

    public Plansza() {
        this.cards = new ArrayList<Karta>();
    }

    public void setdeck(){
        for(Suit cardsuit: Suit.values() ){
            for(Value cardvalue : Value.values()){
                cards.add(new Karta(cardsuit, cardvalue));
            }
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

    public void ustaDeck(){

        ArrayList<Karta> obecny= new ArrayList<Karta>();

        Random random = new Random();
        for(int i =0; i<cards.size(); i++){
            int indeks= random.nextInt((cards.size()-1)+1);
            obecny.add(cards.get(indeks));
            cards.remove(indeks);
        }

        cards= obecny;
    }



}
