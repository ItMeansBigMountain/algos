package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        String s = String.valueOf(number);
        if (s.length() < 1) return 0;
        String output = "";
        for (int x = s.length()-1; x >= 0; x--) {
            output += s.charAt(x);
        }
        return Integer.parseInt(output);
    }
}
