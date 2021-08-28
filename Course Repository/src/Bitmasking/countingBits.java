package Bitmasking;

import java.util.Scanner;

public class countingBits {


    static int count_bits(int n){

        int cnt = 0;

        while(n>0){
            int last_bit = (n&1);
            cnt += last_bit;

            n = n>>1;
        }
        return cnt;
    }

    //Counting Sets Bits : Hack  (Faster method)
    static int count_bits_hack(int n){

        int ans = 0;
        while(n>0){
            //removes the last set bit from the current number
            n = n & (n-1);
            ans++;
        }

        return ans;

    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(count_bits(n));
        System.out.println(count_bits_hack(n));

    }

}
