package Strings;

import java.util.Arrays;

public class ArePermutation {

    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    boolean arePermutation(String str1, String str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same,
        // then they cannot be Permutation
        if (n1 != n2)
            return false;

        // Sort both strings
        sortString(str1);
        sortString(str2);

        // Compare sorted strings
        return str1.equals(str2);
    }

}
