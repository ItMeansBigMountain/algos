package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {

        if (list.size() == 0) return list;



        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int x = list.size(); x > 0 ; x--) {
            output.add(list.get(x-1));
        }

        return output;
    }
}
