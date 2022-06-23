package com.arraylist;

public class sum_all_sub_matrices_sum {
    public static int sum_sub_matrice(int[][] arr){
        int tot_sum=0;
        int n=arr.length;
        int rows=arr.length;
        int col=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                tot_sum += (arr[i][j]*(i+1)*(j+1)*(n-i)*(n-j));
            }
        }
        return tot_sum;
    }
    public static void main(String[] args){
        int [][] A = { {1, 1},{1, 1} };
        System.out.println(sum_sub_matrice(A));
    }
}
