package com.hillel.livinsky.lessons.lesson11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public static String burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        String ordinaryBurger = new String("ordinary burger (" + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ".)");
        return ordinaryBurger;
    }

    public static String dietBurger(String bun, String meat, String cheese, String greens) {
        String dietBurg = new String("diet burger (" + bun + " ," + meat + " ," + cheese + " ," + greens + ".)");
        return dietBurg;
    }

    public static String doubleBurger(String bun, String meat, String cheese, String greens, String mayonnaise, boolean doubleMeat) {
        if (doubleMeat) {
            String doubleBurger = new String("double burger (" + bun + " ,portion of " + meat + "✖2 ," + cheese + " ," + greens + ", " + mayonnaise + ".)");
            return doubleBurger;
        } else {
            return null;
        }
    }
}





