package com.company;

public class Karta {

    private Suit suit;
    private Value value;

    public Karta(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.suit.toString() + "=" + this.value.toString();
    }

    public Value getValue() {
        return value;
    }
}
