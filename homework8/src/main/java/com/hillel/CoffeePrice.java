package com.hillel;

public class CoffeePrice {
    int dollar;
    int cent;

    public CoffeePrice(int dollar, int cent) {
        this.dollar = dollar;
        this.cent = cent;
    }

    public String printPrice() {
        return "Dollar: " + dollar + " Cents: " + cent;
    }
}
