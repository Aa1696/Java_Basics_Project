package com.inheritance;


public class SUV extends Cars{
    public String high_capacity_engine;
    public String all_wheel_drive;
    public String high_ground_clearance;

    SUV(int hand_stearing, int gears, int speed) {
        super(hand_stearing, gears, speed);
    }


    public String getHigh_capacity_engine() {
        return high_capacity_engine;
    }

    public void setHigh_capacity_engine(String high_capacity_engine) {
        this.high_capacity_engine = high_capacity_engine;
    }

    public String getAll_wheel_drive() {
        return all_wheel_drive;
    }

    public void setAll_wheel_drive(String all_wheel_drive) {
        this.all_wheel_drive = all_wheel_drive;
    }

    public String getHigh_ground_clearance() {
        return high_ground_clearance;
    }

    public void setHigh_ground_clearance(String high_ground_clearance) {
        this.high_ground_clearance = high_ground_clearance;
    }


}
