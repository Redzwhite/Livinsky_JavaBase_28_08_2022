package com.hillel.livinsky.lessons.lesson13extra.obstacle;

import com.hillel.livinsky.lessons.lesson13extra.participant.Participant;

public abstract class Obstacle {
    public String obstacle;
    public Double distanceOrHigh;

    public Obstacle(String obstacle,Double distanceOrHigh) {
        this.obstacle = obstacle;
        this.distanceOrHigh = distanceOrHigh;
    }

    public abstract boolean overcome(Participant participant);
}
