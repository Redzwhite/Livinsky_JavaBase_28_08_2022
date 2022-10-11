package com.hillel.livinsky.lessons.lesson13;

import java.util.*;

class Main {
    public static void main(String[] args) {
        PopMusic musicPopGroup = new PopMusic("Pop1");
        PopMusic musicPopGroup2 = new PopMusic("Popi2");
        RockMusic musicRockGroup1 = new RockMusic("rock1");
        RockMusic musicRockGroup2 = new RockMusic("rock2");
        ClassicMusic musicClassicGroup1 = new ClassicMusic("classic1");
        ClassicMusic musicClassicGroup2 = new ClassicMusic("classic2");
        MusicStyles[] MusicPlayList = {musicPopGroup, musicPopGroup2, musicRockGroup1, musicRockGroup2, musicClassicGroup1, musicClassicGroup2};
        for (MusicStyles i : MusicPlayList) {
            i.playMusic();
        }
    }
};



