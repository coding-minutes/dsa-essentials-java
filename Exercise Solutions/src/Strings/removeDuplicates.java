package Strings;

import java.util.HashSet;

public class removeDuplicates {

    String removeDuplicate(String s){
        // your code goes here
        HashSet<Character> st = new HashSet<>();
        for(int i = 0 ; i < s.length(); i++){
            st.add(s.charAt(i));
        }

        StringBuilder str = new StringBuilder("");

        for (char x : st)
            str.append(x);

        return str.toString();
    }

}
