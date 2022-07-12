package com.hashmap;
import java.util.*;

public class question1 {
    public String map(int num){
        HashMap<Integer,String> dict=new HashMap<>();
        dict.put(1,"A");
        dict.put(2,"B");
        dict.put(3,"C");
        dict.put(4,"D");
        dict.put(5,"E");
        dict.put(6,"F");
        dict.put(7,"G");
        dict.put(8,"H");
        dict.put(9,"I");
        dict.put(10,"J");
        dict.put(11,"K");
        dict.put(12,"L");
        dict.put(13,"M");
        dict.put(14,"N");
        dict.put(15,"O");
        dict.put(16,"P");
        dict.put(17,"Q");
        dict.put(18,"R");
        dict.put(19,"S");
        dict.put(20,"T");
        dict.put(21,"U");
        dict.put(22,"V");
        dict.put(23,"W");
        dict.put(24,"X");
        dict.put(25,"Y");
        dict.put(26,"Z");
        String ans="";
        while(num>26){
            int k=num%26;
            if(k==0){
                ans +="Z";
                num=num/26 -1;
            }
            else{
                ans += dict.get(k);
                num =num/26;


            }
        }
        ans = ans + dict.get(num);
        String ans1="";
        for(int i=ans.length()-1;i>=0;i -=1){
            ans1 +=ans.charAt(i);
        }
        return ans1;
    }
}
