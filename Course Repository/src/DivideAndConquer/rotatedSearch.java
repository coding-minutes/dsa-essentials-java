package DivideAndConquer;

import java.util.Scanner;

public class rotatedSearch {


    static int rotated_search(int[] a,int key) {
        int n = a.length;

        //Logic
        int s = 0;
        int e = n - 1;

        while(s<=e){
            int mid = (s+e)/2;

            if(a[mid]==key){
                return mid;
            }

            //2 cases
            if(a[s]<=a[mid]){
                //left
                if(key>=a[s] && key<=a[mid]){
                    e = mid - 1;
                }
			else{
                    s = mid + 1;
                }

            }
            else{
                //right

                if(key>=a[mid] && key<=a[e]){
                    s = mid + 1;
                }
			else{
                    e = mid - 1;
                }

            }

        }
        return -1;

    }


    public static void main(String[] args) {



        int[] a = new int[]{4,5,6,7,0,1,2,3};
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println( rotated_search(a,key) );
    }

}
