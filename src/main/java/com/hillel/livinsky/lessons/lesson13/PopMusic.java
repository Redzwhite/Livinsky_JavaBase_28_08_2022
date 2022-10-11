package com.hillel.livinsky.lessons.lesson13;

public class PopMusic extends MusicStyles {
    public PopMusic(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void playMusic() {
        System.out.println(name + " play pop....");
    }
}
