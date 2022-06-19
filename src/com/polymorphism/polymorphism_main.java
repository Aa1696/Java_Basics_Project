package com.polymorphism;

public class polymorphism_main {
    public static void main(String[] args){
        example1 ex=new child1();
        example1 ex1=new child2();
        ex.method1();
        ex1.method1();
    }
}
