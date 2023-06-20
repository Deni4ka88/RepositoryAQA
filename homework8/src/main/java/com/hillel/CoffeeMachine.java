package com.hillel;

public class CoffeeMachine {
    int volume;
    String name;
    int sugar;
    CoffeePrice price;

    public CoffeeMachine(int volume, String name, int sugar, CoffeePrice price) {
        this.volume = volume;
        this.name = name;
        this.sugar = sugar;
        this.price = price;
    }

    public void printCoffeePrice() {
        System.out.println("Name: " + name + " Volume: " + volume + " Sugar: " + sugar + " Price: " + price.printPrice());
    }

    public CoffeeMachine(int volume, String name, CoffeePrice price) {
        this.volume = volume;
        this.name = name;
        this.price = price;
    }
}
