package com.arraylist;
import java.util.*;
import java.io.*;

public class prefix_sum_2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int[][] arr= new int[rows][column];
        int row=arr.length;
        for(int i=0 ;i<rows ;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));

    }


}
