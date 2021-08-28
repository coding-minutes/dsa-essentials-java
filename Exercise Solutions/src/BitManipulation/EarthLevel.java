package BitManipulation;

public class EarthLevel {

    static long convertDecimalToBinary(long n)
    {
        long binaryNumber = 0;
        long remainder, i = 1, step = 1;

        while (n!=0)
        {
            remainder = n%2;
            n /= 2;
            binaryNumber += remainder*i;
            i *= 10;
        }
        return binaryNumber;
    }

    static int earthLevel(int k)
    {
        long binaryNumber, sum = 0;
        binaryNumber = convertDecimalToBinary(k);

        while (binaryNumber != 0)
        {
            long t;
            t = binaryNumber%2;
            sum = sum + t;
            binaryNumber = binaryNumber/10;
        }

        return (int) sum;
    }

    public static void main(String[] args){
        System.out.print(earthLevel(15));
    }

}
