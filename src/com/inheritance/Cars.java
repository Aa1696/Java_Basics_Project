package com.inheritance;

public class Cars extends Vechicle{
    public String type_of_engine;
    public String date_of_production;
    public int mileage;

    Cars(int hand_stearing, int gears, int speed) {
        super(hand_stearing, gears, speed);
    }


    public String getType_of_engine() {
        return type_of_engine;
    }

    public void setType_of_engine(String type_of_engine) {
        this.type_of_engine = type_of_engine;
    }

    public String getDate_of_production() {
        return date_of_production;
    }

    public void setDate_of_production(String date_of_production) {
        this.date_of_production = date_of_production;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
