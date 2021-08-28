package basicSorting;

public class coutingSort {


    static void counting_sort(int a[],int n){
        //Largest Element
        int largest = -1;

        for(int i=0;i<n;i++){
            largest = Math.max(largest,a[i]);
        }

        //create a count array/vector
        int[] freq = new int[(largest+1)];

        //Update the freq array
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }

        //Put back the elements from freq into original array

        int j = 0;
        for(int i=0; i<=largest; i++){

            while(freq[i]>0){
                a[j] = i;
                freq[i]--;
                j++;
            }
        }
        return;

    }



    public static void main(String[] args){

        int arr[] = {88, 97, 10, 12, 15, 1, 5, 6, 12, 5, 8};
        int n = arr.length;
        counting_sort(arr, n);

        for(int k: arr){
            System.out.println(k);
        }

    }
}
