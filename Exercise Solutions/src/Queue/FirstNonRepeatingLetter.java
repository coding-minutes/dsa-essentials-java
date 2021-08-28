package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter {

    final int MAX_CHAR = 26;

    ArrayList<Character> firstnonrepeating(ArrayList<Character> str)
    {
        Queue<Character> q = new LinkedList<>();
        ArrayList<Character> v = new ArrayList<>();

        int[] charCount = new int[MAX_CHAR] ;

        for (int i = 0; i<str.size(); i++) {

            q.add(str.get(i));

            charCount[str.get(i) - 'a']++;

            while (!q.isEmpty()) {
                if (charCount[q.peek() - 'a'] > 1)
                    q.poll();
                else {
                    v.add(q.peek());
                    break;
                }
            }

            if (q.isEmpty())
                v.add('0');
        }
        return v;
    }


}
