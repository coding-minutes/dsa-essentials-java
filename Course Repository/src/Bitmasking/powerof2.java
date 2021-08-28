package Bitmasking;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if((n & (n-1)) ==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }

    }
}
