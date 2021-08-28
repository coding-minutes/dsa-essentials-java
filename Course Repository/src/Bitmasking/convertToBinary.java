package Bitmasking;

import java.util.Scanner;

public class convertToBinary {


    static int convertTobinary(int n){

        int ans = 0;
        int p = 1;

        while(n>0){
            int last_bit = (n&1);
            ans += p*last_bit;

            p = p*10;
            n = n>>1;
        }
        return ans;

    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(convertTobinary(n));

    }
}
