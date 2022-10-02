package com.hillel.livinsky.lessons.lesson11;

public class BurgerMain {

    public static void main(String[] args) {
        System.out.println(Burger.burger("bun", "meat", "cheese", "greens", "mayonnaise"));
        System.out.println(Burger.dietBurger("bun", "meat", "cheese", "greens"));
        System.out.println(Burger.doubleBurger("bun", "meat", "cheese", "greens", "mayonnaise", true));

    }
}