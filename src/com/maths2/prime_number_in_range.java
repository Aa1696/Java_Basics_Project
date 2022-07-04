package com.maths2;
import java.util.*;

public class prime_number_in_range {
    public boolean isprime(int a){
        if(a<0){
            return false;
        }
        if(a==2 || a==3){
            return true;
        }
        if(a%2==0 || a%3==0){
            return false;
        }
        for(int i=5;i<Math.sqrt(a);i +=6){
            if(a%i==0 || a%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> prime(int A){
        ArrayList<Integer> arr1= new ArrayList<>();
        int [] arr=new int[A+1];
        int cnt=0;
        arr[0]=0;
        for(int i=1;i<=A;i++){
            arr[i]=1;
        }
        for(int j=2;j<=A;j++){
            if(isprime(j)){
                for(int k =j+j;k<=A;k +=j){
                    arr[k]=0;
                }
            }
        }
       for(int i=1;i<arr.length;i++){
           if(arr[i]==1){
               arr1.add(i);
           }
       }

        return arr1;

    }

    public static void main(String[] args){
        prime_number_in_range pm=new prime_number_in_range();
        System.out.println(pm.prime(50));
    }
}
