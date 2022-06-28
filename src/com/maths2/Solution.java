package com.maths2;
import java.util.*;

public class Solution {
    public int trailingzero(int A){
        int count =0;
        while(A !=0){
            count +=A/5;
            A=A/5;
        }
        return count;
    }
    public static void main(String [] args){
        Solution ss=new Solution();
        int A=25;
        System.out.println("Trailing zero of "+A +" is "+ss.trailingzero(A));
    }
}
