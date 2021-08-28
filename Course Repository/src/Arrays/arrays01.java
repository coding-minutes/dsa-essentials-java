package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays01 {

    public static void main(String[] args){
        int[] marks = new int[100] ;
        Arrays.fill(marks, -1);
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the no of students ");
        int n = scn.nextInt();


        //Input
        for(int i=1; i<=n; i++){
            marks[i]  = scn.nextInt();

            marks[i] = marks[i]*2;
        }

        //Update


        //Output
        for(int i=0;i<100;i++){
           System.out.print(marks[i] +  " ,");
        }
        System.out.println();

    }
}
