package BackTracking;

public class subset {


    //------------Function 1
    static void filter_bits(char arr[],int num){

        //find out all the bits
        int j = 0;
        while(num>0){
            int last_bit = (num&1);
            if(last_bit == 1){
                System.out.println(arr[j]);
            }
            j++;
            num = (num>>1);
        }
        System.out.println();

    }


    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c'};

        int n = 3;

        for(int i=0;i<(1<<n); i++){
            filter_bits(arr,i);
        }

    }

}
