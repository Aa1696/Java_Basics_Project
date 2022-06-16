package com.inheritance;

public class Bicycle {
    int gear,speed;
    Bicycle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void upspeed(int decrement){
        this.speed +=decrement;
    }
    public void applybreak(int decrement){
        this.gear -=decrement;
    }
    public String toString(){
        return ("Number of gears are " + this.gear + " Speed of the Bicycle " + this.speed);
    }
}

