package com.hillel.livinsky.lessons.homework17;

public class DrinksMaker {
    public static void makeDrink(DrinksMachine drinksMachine) {
        new DrinksCount();
        System.out.println(" Please take your " + drinksMachine.getTitle());
    }
}
