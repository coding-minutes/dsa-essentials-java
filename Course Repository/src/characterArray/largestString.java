package characterArray;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class largestString {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();


        String str;
        String largest = null;


        int largest_len = 0;

        while (n-- > 0) {
            str = scn.nextLine();
            //cout<< sentence <<endl;
            int len = str.length();
            if (len > largest_len) {
                largest_len = len;
                largest = str;
            }
        }
        System.out.println(largest);
    }
    
    
    
}
