package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.*;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {

        ArrayList<Integer> output = new ArrayList();

        for (int i = 0 ; i < myList.size() ; i++ )
        {
            output.add( myList.get(i).length());
        }

        return output;
    }


}
