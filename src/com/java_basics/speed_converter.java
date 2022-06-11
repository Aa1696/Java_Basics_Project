package com.java_basics;

public class speed_converter {
    public static void main(String[] args){
            milesperhr(40.5);


    }
    public static double speed(double kmph){
        if(kmph<0){
            return -1;
        }
        return Math.round(kmph/1.69);
    }
    public static void milesperhr(double kmph){
        double milsphr=speed(kmph);
        if(milsphr<0){
            System.out.println("Invalid Value");
        }
        System.out.println("kmph =" + kmph + "==" + " milesperhpur " + milsphr );
    }
}
