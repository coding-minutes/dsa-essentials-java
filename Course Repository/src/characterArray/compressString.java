package characterArray;

public class compressString {


    public static String compressString(String str){

        int n = str.length();

        String output = "";

        for(int i=0;i<n; i++){

            int count = 1;

            while(i< n-1 && str.charAt(i+1) == str.charAt(i)){
                count++;
                i++;
            }
            output = output + str.charAt(i);
            output += (count);

        }
        if(output.length() > str.length()){
            return str;
        }
        return output;

    }


    public static void main(String[] args) {


        String s1 = "aaabbccddee";
        System.out.println(compressString(s1));

        String s2 = "abcd";
        System.out.println(compressString(s2));

    }

}
