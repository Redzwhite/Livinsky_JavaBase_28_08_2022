package com.hillel.livinsky.lessons.lesson13;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void playMusic() {
        System.out.println(name + " play classic....");
    }
}
