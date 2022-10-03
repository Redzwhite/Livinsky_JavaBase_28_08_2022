package com.hillel.livinsky.lessons.lesson11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    boolean mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public static String makeBurger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        String ordinaryBurger = new String("ordinary burger (" + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ".)");
        return ordinaryBurger;
    }
}





