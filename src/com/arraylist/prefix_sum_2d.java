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
        System.out.println(Arrays.deepToString(arr));

        int [][] prefix_sum= new int[rows][column];
        for(int i=0 ;i<rows ;i++){
            for(int j=0;j<column;j++){
                if(i==0 && j==0){
                    prefix_sum[i][j]=arr[i][j];
                }
                else if(i==0 && j>0){
                    prefix_sum[i][j]=prefix_sum[i][j-1]+arr[i][j];
                }
                else if(i>0 && j==0){
                    prefix_sum[i][j]=prefix_sum[i-1][j]+arr[i][j];
                }
                else{
                    prefix_sum[i][j]=prefix_sum[i-1][j]+prefix_sum[i][j-1]-prefix_sum[i-1][j-1]+arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(prefix_sum));
    }


}
