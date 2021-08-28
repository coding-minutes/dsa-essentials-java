package Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class vectorSort {

    static class Pair implements Comparable<Pair>{
        String first;
        int[] second;

        Pair(String a, int[] s){
            first = a;
            second = s;
        }

        @Override
        public int compareTo(Pair o) {
            return calcTotalMarks(this.second) - calcTotalMarks(o.second);
        }
    }

    static int calcTotalMarks(int[] marks){
        return marks[0] + marks[1] + marks[2];
    }


    public static void main(String[] args) {

         ArrayList<Pair> student_marks = new ArrayList<>(Arrays.asList(new Pair("Rohan", new int[]{10,20,11}),
                 new Pair("Prateek",new int[]{10,21,3}),
                new Pair("Vivek",new int[]{4,5,6}),
                 new Pair("Rijul",new int[]{10,13,20})));

        Collections.sort(student_marks);

        for(Pair s : student_marks){
            System.out.println(s.first + " " + calcTotalMarks(s.second));
        }

    }

}
