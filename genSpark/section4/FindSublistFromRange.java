package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {

        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int x = from; x <= elms.size() ; x++) {
            if (x == to) break;
            output.add(elms.get(x));
        }

        return output;

    }
}
