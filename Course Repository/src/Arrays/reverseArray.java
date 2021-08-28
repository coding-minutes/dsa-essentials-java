package Arrays;


public class reverseArray {

    static void reverseArray(int arr[],int n){

        int s = 0;
        int e = n - 1;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s += 1;
            e -= 1;
        }

    }


    public static void main(String[] args){

        int arr[] = {10,20,30,45,60,80,90};
        int n = arr.length;
        //Print the Output
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();


        reverseArray(arr,n);

        //Print the Output
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
