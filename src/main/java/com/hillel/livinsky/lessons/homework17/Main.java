package com.hillel.livinsky.lessons.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        run();
        System.out.println("Total price: " + totalPrice);
        System.out.println("Total count: " + DrinksCount.count);
        scanner.close();
    }

    private static void run() {
        System.out.println("You can buy: " + Arrays.toString(DrinksMachine.values()));

        while (true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (drinksMachine == null) {
                return;
            }

            String str = "You choose: %s, price: %s";
            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.printf(str, drinksMachine.getTitle(), Drinks.COFFEE_PRICE);
                    DrinksMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COFFEE_PRICE;
                    break;
                }
                case TEA -> {
                    System.out.printf(str, drinksMachine.getTitle(), Drinks.TEA_PRICE);
                    DrinksMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.TEA_PRICE;
                    break;
                }
                case LEMONADE -> {
                    System.out.printf(str, drinksMachine.getTitle(), Drinks.LEMONADE_PRICE);
                    DrinksMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.LEMONADE_PRICE;
                    break;
                }
                case MINERALWATER -> {
                    System.out.printf(str, drinksMachine.getTitle(), Drinks.MINERAL_WATER_PRICE);
                    DrinksMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.MINERAL_WATER_PRICE;
                    break;
                }
                case MOJITO -> {
                    System.out.printf(str, drinksMachine.getTitle(), Drinks.MOJITO_PRICE);
                    DrinksMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.MOJITO_PRICE;
                    break;
                }
                case COCACOLA -> {
                    System.out.printf(str, drinksMachine.getTitle(), Drinks.COCA_COLA_PRICE);
                    DrinksMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COCA_COLA_PRICE;
                    break;
                }
            }
        }
    }

    private static DrinksMachine getDrinkType() {
        System.out.println("Please choose drink or type \"stop\"");

        while (true) {
            String str = scanner.next().toUpperCase();

            if (str.equals("STOP")) {
                return null;
            }

            for (DrinksMachine value : DrinksMachine.values()) {
                if (str.equals(value.toString())) {
                    return DrinksMachine.valueOf(str);
                }
            }
            System.out.println("Please choose your drinks  " + Arrays.toString(DrinksMachine.values()));

        }
    }
}