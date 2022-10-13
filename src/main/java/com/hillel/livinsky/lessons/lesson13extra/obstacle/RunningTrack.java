package com.hillel.livinsky.lessons.lesson13extra.obstacle;

import com.hillel.livinsky.lessons.lesson13extra.participant.Participant;

public class RunningTrack extends Obstacle{
    public RunningTrack(String obstacle,Double distanceOrHigh) {
        super(obstacle,distanceOrHigh);
    }

    @Override
    public boolean overcome(Participant participant) {
        if (this.distanceOrHigh > participant.maximumDistance) {
            System.out.println("Участник[" + participant.name + "] не прошел препятствие["
                    + this.obstacle + "] на дистанции[" + this.distanceOrHigh + "]. Пройдено["
                    + participant.maximumDistance + "]\n");
            System.out.println("Участник[" + participant.name + "] выбыл!");
            return false;
        } else if (this.distanceOrHigh < participant.maximumDistance || this.distanceOrHigh.equals(participant.maximumDistance)) {
            System.out.println("Участник[" + participant.name + "] прошел препятствие["
                    + this.obstacle + "] на дистанции[" + this.distanceOrHigh + "]\n");
            participant.run(this.obstacle);
            return true;
        } else {
            return false;
        }
    }
}
