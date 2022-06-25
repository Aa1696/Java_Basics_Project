package Solution;

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
    public int solve(int[] A) {
        int new_gcd=A[0];
        int n=A.length;
        for(int i=1;i<n;i++){
            new_gcd=gcd(new_gcd,A[i]);
        }

        if(new_gcd==1){
            return 0;
        }
        return -1;
    }
    public int solve1(int A, int B, int C) {
        int new_gcd=gcd(B,C);
        int new_num=(B*C)/new_gcd;
        return A/new_num;

    }
    public int solve2(int[] A) {
        int n=A.length;
        int [] prefix=new int [n];
        int [] suffix=new int [n];
        prefix[0]=A[0];
        suffix[n-1]=A[n-1];
        int k=n-2;
        int i=1;
        while(i<=n-1 && k>=0){
            prefix[i]=gcd(prefix[i-1],A[i]);
            suffix[k]=gcd(suffix[k+1],A[k]);
            i+=1;
            k -=1;

        }
        int max_gcd=suffix[1];
        for(int j=1;j<n;j++){
            if(j != n-1){
                max_gcd=Math.max(max_gcd,gcd(prefix[j-1],suffix[j+1]));
            }
            else{
                max_gcd=Math.max(max_gcd,prefix[j-1]);
            }

        }
        return max_gcd;
    }

    public static void main(String[] args){
        Solution sk= new Solution();
        int [] A = {7, 2, 5};
        int[] B = {12, 15, 18};
        System.out.println("Minimum elements to be deleted to make gcd 1 of an array:"+sk.solve(A));
        System.out.println("One integer corresponding to the number of special integers less than or equal to A:"+sk.solve1(12,3,2));
        System.out.println("delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum:"+sk.solve2(B));
    }

}
