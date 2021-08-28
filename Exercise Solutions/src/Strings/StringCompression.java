package Strings;

public class StringCompression {


    int compress(char[] chars) {

        int count_=1;
        String ans = "";


        for(int i=0;i<chars.length;i++)
        {
            while(i<chars.length-1 && chars[i+1] == chars[i])
            {
                count_++;
                i++;
            }
            ans += chars[i];
            if(count_ == 1)
            {
                continue;
            }
            ans += (count_);
            count_ = 1;
        }

        chars = new char[ans.length()];

        for(int i=0;i<ans.length();i++)
        {
            chars[i] = (ans.charAt(i));
        }

        return chars.length;
    }

}
