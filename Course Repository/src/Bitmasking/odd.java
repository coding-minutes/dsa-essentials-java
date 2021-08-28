package Bitmasking;

import java.util.Scanner;

public class odd {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if((n&1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }

    }
}
