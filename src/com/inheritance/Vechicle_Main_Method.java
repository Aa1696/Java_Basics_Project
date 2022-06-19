package com.inheritance;

public class Vechicle_Main_Method {
    public static void main(String[] args){
        SUV sv=new SUV(2,4,50);
        sv.setAll_wheel_drive("4_Black_Book");
        System.out.println(sv.getAll_wheel_drive());

        Vechicle vh=new Vechicle(2,4,50);
        System.out.println(vh.getGears());

    }
}
