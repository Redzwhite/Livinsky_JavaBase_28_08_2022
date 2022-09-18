package com.hillel.livinsky.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        var min = 18;
        var max = 40;
        int averageTeam1 = 0;
        int averageTeam2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }

        for (int t1 : team1) {
            averageTeam1 += t1;
        }

        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }

        for (int t2 : team2) {
            averageTeam2 += t2;
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        System.out.println("average age of players team1 : " + averageTeam1 / team1.length);
        System.out.println("average age of players team2 : " + averageTeam2 / team2.length);
    }
}


