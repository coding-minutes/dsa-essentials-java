package Strings;

public class findVowel {


    String vowel(String S){
        // your code goes here
        StringBuilder out = new StringBuilder();

        for(int i = 0; i < S.length(); i++){
            char x = S.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                out.append(x);
        }
        return out.toString();
    }
}
