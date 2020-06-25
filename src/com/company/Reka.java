package com.company;

import java.util.ArrayList;

public class Reka extends Talia {

    private ArrayList<Karta> reka;
    private String name;
    private double hajs;

    public Reka(String name) {
        this.reka = new ArrayList<Karta>();
        this.name=name;
        this.hajs=100.0;
    }

    @Override
    public void setdeck() {
        super.setdeck();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ArrayList<Karta> getReka() {
        return reka;
    }

    public void setReka(ArrayList<Karta> reka) {
        this.reka = reka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHajs() {
        return hajs;
    }

    public void setHajs(double hajs) {
        this.hajs = hajs;
    }

    @Override
    public void wybierzKarte(Talia deck) {
        super.wybierzKarte(deck);
    }

    @Override
    public void ustaw() {
        super.ustaw();
    }

    @Override
    public void remove(int i) {
        super.remove(i);
    }

    @Override
    public Karta wezKarte(int i) {
        return super.wezKarte(i);
    }

    @Override
    public void dodaj(Karta k) {
        super.dodaj(k);
    }

    @Override
    public int wartosci() {
        return super.wartosci();
    }
}
