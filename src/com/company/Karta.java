package com.company;

public class Karta {

    private Rodzaj rodzaj;
    private Wartosc wartosc;

    public Karta(Rodzaj rodzaj, Wartosc wartosc) {
        this.rodzaj = rodzaj;
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return this.rodzaj.toString() + "=" + this.wartosc.toString();
    }

    public Wartosc getValue() {
        return wartosc;
    }

    public Rodzaj getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(Rodzaj rodzaj) {
        this.rodzaj = rodzaj;
    }

    public Wartosc getWartosc() {
        return wartosc;
    }

    public void setWartosc(Wartosc wartosc) {
        this.wartosc = wartosc;
    }
}
