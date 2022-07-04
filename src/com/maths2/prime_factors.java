package com.maths2;
import java.util.*;

public class prime_factors {
    public boolean isprime(int a) {
        if (a < 0) {
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(a); i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int prime_factor_count(int a) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int i = 2;
        int cnt = 0;
        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {
                if (a / i == i) {
                    arr1.add(i);
                } else {
                    arr1.add(i);
                    arr1.add(a/i);
                }
            }
            i += 1;
        }
        for(int num:arr1){
            if(num !=1){
                if (isprime(num)) {
                    arr2.add(num);
                }
            }
        }
        return arr2.size();

    }
    public ArrayList<Integer> lucky_number(int a){
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<a+1;i++){
            if(prime_factor_count(i)==2){
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        prime_factors prm= new prime_factors();
        System.out.println(prm.lucky_number(77).size());
    }
}