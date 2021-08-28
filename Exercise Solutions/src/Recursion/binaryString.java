package Recursion;

import java.util.ArrayList;

public class binaryString {


    ArrayList<String> v;

    void helper(StringBuilder str, int n,int i){
        if(i==n){
            v.add(str.toString());
            return;
        }
        StringBuilder s1=  new StringBuilder(str.toString());
        s1.append('0');
        helper(s1,n,i+1);

        if(i>0 && str.charAt(i-1)=='0'){
            str.append('1');
            helper(str,n,i+1);
        }
        else if(i==0){
            str.append('1');
            helper(str,n,i+1);
        }
    }

    ArrayList<String> binaryStrings(int n){
        v = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        helper(str,n,0);
        return v;

    }
}
