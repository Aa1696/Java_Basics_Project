package com.java_basics;

public class exercise1 {
    public static void main(String[] args){
        exerc(4);

    }
    public static void exerc(int n){
        if(n>0){
            System.out.println("Positive");
        } else if (n==0) {
            System.out.println("Zero");

        }
        else{
            System.out.println("Negative");
        }
    }
}
