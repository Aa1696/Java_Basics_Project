package com.inheritance;

public class Vechicle {
    public int hand_stearing;
    public int gears;
    public int speed;
    Vechicle(int hand_stearing,int gears, int speed){
        this.hand_stearing=hand_stearing;
        this.gears=gears;
        this.speed=speed;
    }

    public int getHand_stearing() {
        return hand_stearing;
    }

    public void setHand_stearing(int hand_stearing) {
        this.hand_stearing = hand_stearing;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
