package com.arraylist;

import java.util.Arrays;

public class rearrange_array {
    public static int[] rearrange(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[arr[i]%n] +=(i*n);
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;
        }
        return arr;
    }
    public static void main(String[] args){
        int [] A = {1, 2, 3, 4, 0};
        System.out.println(Arrays.toString(rearrange(A)));
    }

}
