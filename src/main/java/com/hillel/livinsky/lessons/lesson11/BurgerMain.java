package com.hillel.livinsky.lessons.lesson11;

public class BurgerMain {

    public static void main(String[] args) {
        System.out.println(Burger.makeBurger("bun", "meat", "cheese", "greens", "mayonnaise"));
        System.out.println(DietBurger.makeBurger("bun", "meat", "cheese", "greens"));
        System.out.println(DoubleBurger.makeBurger("bun", "meat", "cheese", "greens", true, true));

    }
}