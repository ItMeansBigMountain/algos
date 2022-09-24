package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class RetrieveRandomElmFromArrList implements Assignment {
    public Integer solution(ArrayList<Integer> arrList, int elm) {
        if (arrList.isEmpty()) return 0;
        if (elm >= arrList.size() || elm < 0) return 0;
        return arrList.get(elm);
    }
}
