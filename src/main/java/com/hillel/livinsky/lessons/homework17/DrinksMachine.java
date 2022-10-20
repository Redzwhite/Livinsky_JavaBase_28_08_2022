package com.hillel.livinsky.lessons.homework17;

public enum DrinksMachine {
    COFFEE("КАВА"),
    TEA("ЧАЙ"),
    LEMONADE("ЛИМОНАД"),
    MOJITO("МОХІТО"),
    MINERALWATER("МИНЕРАЛКА"),
    COCACOLA("КОКА-КОЛА");

    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;

    }
}
