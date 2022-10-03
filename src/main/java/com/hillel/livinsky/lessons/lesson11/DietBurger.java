package com.hillel.livinsky.lessons.lesson11;

public class DietBurger extends Burger{

    public DietBurger(String bun, String meat, String cheese, String greens) {
        super(bun, meat, cheese, greens, false);
    }
    public static String makeBurger(String bun, String meat, String cheese, String greens) {
        String dietBurger = new String("diet burger (" + bun + " ," + meat + " ," + cheese + " ," + greens + ".)");
        return dietBurger;
    }
}
