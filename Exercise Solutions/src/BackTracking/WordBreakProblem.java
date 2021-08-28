package BackTracking;

import java.util.ArrayList;

public class WordBreakProblem {


    int cnt = 0;
    void help(String s, int n, String res, String[] word)
    {
        for (int i = 1; i <= n; i++)
        {
            String ss = s.substring(0, i);
            int l = word.length;
            boolean flag = false;

            for (int j = 0; j < l; j++)
                if (word[j].equals(ss))
                    flag = true;

            if (flag)
            {
                if (i == n)
                {
                    cnt++;
                    return;
                }
                help(s.substring(i, n - i), n - i, res + ss + " ", word);
            }
        }
    }

    int wordBreak(String s, String[] dictionary)
    {
        cnt = 0;
        help(s, s.length(), "", dictionary);
        return cnt;
    }

}
