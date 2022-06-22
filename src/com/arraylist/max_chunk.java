package com.arraylist;

public class max_chunk {
    public static int count_chunk(int[] arr){
        int n=arr.length;
        int [] min_arr=new int[n];
        min_arr[n-1]=Integer.MAX_VALUE;
        int chunk=0;
        int max_chunk=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            min_arr[i]=Integer.min(arr[i+1],min_arr[i+1]);
        }
        for(int i=0;i<n;i++){
            max_chunk=Integer.max(max_chunk,arr[i]);
            if(max_chunk<=min_arr[i]){
                chunk +=1;
            }
        }
        return chunk;
    }
    public static void main(String[] args){
        int[] arr={2,0,1,2};
        int count =count_chunk(arr);
        System.out.println(count);

    }
}
