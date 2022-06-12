package com.java_basics;
import java.util.*;
public class method_overloading {
    public int mthd1(String str){
        int length=str.length();
        return length;
    }

    public String mthd2(int n){
        String str="n";
        return str;
    }
    public double calcFeetAndInchesToCentimeters(double feet , double inch){
            if((feet<0) || (inch<0) || (inch>12)){
                System.out.println("Invalid Parameter of Inch and feet");
                return -1;
            }
            double centimeter=(feet*12)*2.54;
            centimeter += inch*2.54;
            System.out.println(feet + " feet, " + inch + " inches = " + centimeter + " cm");
            return centimeter;

    }
    public double calcFeetAndInchesToCentimeters(double inch){

        if(inch<0){
            System.out.println("Invalid parameter");
            return -1;
        }
        double new_feet= (int) inch / 12;
        double new_inch = (int) inch % 12;
        System.out.println(inch + " inches is equal to " + new_feet + " feet and " + new_inch + " inches");
        return calcFeetAndInchesToCentimeters(new_feet,new_inch);
    }
}
