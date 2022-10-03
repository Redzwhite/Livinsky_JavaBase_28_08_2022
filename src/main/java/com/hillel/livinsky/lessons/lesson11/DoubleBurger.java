package com.hillel.livinsky.lessons.lesson11;

public class DoubleBurger extends Burger{
    boolean mayonnaise;
    boolean doubleMeat;

    public DoubleBurger(String bun, String meat, String cheese, String greens, boolean mayonnaise, boolean doubleMeat) {
        super(bun, meat, cheese, greens, mayonnaise);
        this.mayonnaise = true;
        this.doubleMeat = true;
    }
    public static String makeBurger(String bun, String meat, String cheese, String greens, boolean mayonnaise, boolean doubleMeat) {
        String doubleBurger = new String("double burger (" + bun + " ,portion of " + meat + "✖2 ," + cheese + " ," + greens + ", mayonnaise.)");
        return doubleBurger;
    }
}
