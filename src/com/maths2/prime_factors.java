package com.maths2;
import java.util.*;

public class prime_factors {
    public boolean isprime(int a) {
        if (a < 0) {
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(a); i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int prime_factor_count(int a) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int i = 2;
        int cnt = 0;
        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {
                if (a / i == i) {
                    arr1.add(i);
                } else {
                    arr1.add(i);
                    arr1.add(a/i);
                }
            }
            i += 1;
        }
        for(int num:arr1){
            if(num !=1){
                if (isprime(num)) {
                    arr2.add(num);
                }
            }
        }
        return arr2.size();

    }
    public ArrayList<Integer> lucky_number(int a){
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<a+1;i++){
            if(prime_factor_count(i)==2){
                arr.add(i);
            }
        }
        return arr;
    }
    public ArrayList<Integer> solve(int A, int[] B) {
        int[] prm_arr = new int[1000001];
        int[] prm_cnt = new int[1000001];
        prm_arr[0] = 0;
        prm_arr[1] = 0;
        for (int i = 0; i < prm_cnt.length; i++) {
            prm_cnt[i] = 0;
        }
        for (int j = 2; j < prm_arr.length; j++) {
            prm_arr[j] = 1;
        }
        for (int num = 2; num <= 1000001; num += 1) {
            if (prm_arr[num] == 1) {
                prm_cnt[num] += 1;
            }
            for (int new_num = num + 1; new_num <= 1000001; new_num += num) {
                if (prm_arr[new_num] == 1) {
                    prm_cnt[new_num] += 1;
                }
                prm_arr[new_num] = 0;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int n1 = 0; n1 <= 1000000; n1 += 1) {
            if (prm_arr[n1] > 1 && prm_arr[n1] <= 1000000) {
                ans.add(prm_cnt[prm_arr[n1]]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        prime_factors prm= new prime_factors();
        System.out.println(prm.lucky_number(77).size());
    }
}