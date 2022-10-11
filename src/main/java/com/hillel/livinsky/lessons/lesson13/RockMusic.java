package com.hillel.livinsky.lessons.lesson13;

public class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void playMusic() {
        System.out.println(name + " play rock....");
    }
}
