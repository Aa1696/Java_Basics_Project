package com.maths2;
import java.util.*;

public class factors_of_number {

    public int divisors(int a){
        int i=1;
        int cnt =0;
        while(i<=Math.sqrt(a)){
            if(a%i==0){
                if(a/i==i){
                    cnt +=1;
                }
                else{
                    cnt +=2;
                }
            }
            i +=1;
        }
        return cnt;

    }
    public static void main(String [] args){
        factors_of_number fc= new factors_of_number();
        System.out.println(fc.divisors(8));
    }
}
