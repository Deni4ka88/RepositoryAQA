package com.hillel;

public class MakeACoffee {
    public static void main(String[] args) {
        CoffeePrice coffeePrice = new CoffeePrice(2, 50);
        CoffeeMachine coffee = new CoffeeMachine(40, "Espresso", 1, coffeePrice);
        coffee.printCoffeePrice();

//      тут не можу передати замість посилання параметри
        System.out.println("Name: "+ coffee.name + " Volume: " + coffee.volume + " Sugar: " + coffee.sugar + " Price: " + coffeePrice.printPrice());

        CoffeeMachine coffee2 = new CoffeeMachine(120, "Americano", coffeePrice);
        System.out.println("Name: "+coffee2.name + " Volume: " + coffee2.volume + " Sugar: " + coffee2.sugar + " Price: " + coffeePrice.printPrice());

        anotherCoffee(coffee);
        System.out.println("Name: "+coffee.name + " Volume: " + coffee.volume + " Sugar: " + coffee.sugar + " Price: " + coffeePrice.printPrice());
    }

    public static void anotherCoffee(CoffeeMachine latte) {
        latte.name = "Latte";
        latte.volume = 180;
    }

}

