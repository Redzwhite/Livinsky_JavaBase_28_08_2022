package com.hillel.livinsky.lessons.lesson13extra;

import com.hillel.livinsky.lessons.lesson13extra.obstacle.Obstacle;
import com.hillel.livinsky.lessons.lesson13extra.obstacle.RunningTrack;
import com.hillel.livinsky.lessons.lesson13extra.obstacle.Wall;
import com.hillel.livinsky.lessons.lesson13extra.participant.Cat;
import com.hillel.livinsky.lessons.lesson13extra.participant.Human;
import com.hillel.livinsky.lessons.lesson13extra.participant.Participant;
import com.hillel.livinsky.lessons.lesson13extra.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Bob", 1.0, 30.0),
                new Cat("Tom", 2.5, 1000.0),
                new Robot("T-800", 20.0, 10000.0),
        };
        Obstacle[] obstacles = {
                new Wall("Wall", 2.0),
                new RunningTrack("RunningTrack", 20.0),
                new Wall("Wall1", 0.5),
                new Wall("Wall2", 1.5),
                new RunningTrack("RunningTrack2", 2000.0)
        };
        for (Participant par : participants) {
            boolean pass = true;
            if (!pass) {
                continue;
            } else {
                for (Obstacle obs : obstacles) {
                    pass = obs.overcome(par);
                }
            }
        }
    }
}