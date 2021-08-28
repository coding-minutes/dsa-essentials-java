package Strings;

public class checkPalindrome {


    boolean isPalindrome(String str)
    {
        // Start from leftmost and rightmost corners of str
        int l = 0;
        int h = str.length() - 1;

        // Keep comparing characters while they are same
        while (h > l)
        {
            if (str.charAt(l++) != str.charAt(h--))
            {
                return false;
            }
        }
        return true;
    }
}
