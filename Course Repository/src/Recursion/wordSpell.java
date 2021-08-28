package Recursion;

import java.util.Scanner;

public class wordSpell {


    static String spell[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};


    static void printSpell(int n){

        if(n==0){
            return;
        }
        int last_digit = n%10;
        printSpell(n/10);
        System.out.println(spell[last_digit]);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSpell(n);

    }

}
