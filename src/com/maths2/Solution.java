package com.maths2;
import java.util.*;

public class Solution {
    public int gcd(int a,int b){
        if(a<b){
            int tmp=a;
            a=b;
            b=tmp;
        }
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==1 || b==1){
            return 1;
        }
        return gcd(a%b,b);
    }
    public int trailingzero(int A){
        int count =0;
        while(A !=0){
            count +=A/5;
            A=A/5;
        }
        return count;
    }
    public int cpFact(int A, int B) {
        if(gcd(A,B)==1){
            return A;
        }
        while(gcd(A,B) != 1){
            A=A/gcd(A,B);
        }
        return A;

    }
    public static void main(String [] args){
        Solution ss=new Solution();
        int A=25;
        System.out.println("Trailing zero of "+A +" is "+ss.trailingzero(A));
        System.out.println("the maximum valued integer X X divides A i.e. A % X = 0\n" +
                "X and B are co-prime i.e. gcd(X, B) = 1 and "+ 30 + " and "+ 12 + " is " +ss.cpFact(30,12));
    }
}
