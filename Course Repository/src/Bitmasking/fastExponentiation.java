package Bitmasking;

import java.util.Scanner;

public class fastExponentiation {

//    /Fast Exponentitation
    static int fastExpo(int a,int n){
        int ans = 1;

        while(n>0){
            int last_bit = (n&1);
            if(last_bit == 1){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;

        }
        return ans;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();

        System.out.println(fastExpo(a,n));

    }

}
