package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {

        if (numbers.size() == 0 ) return 0;
        else if (numbers.get(0) != 1) return 1;

        for(int x = 0; x < numbers.size()-1 ; x++ )
        {
            if (numbers.get(x) + 1 !=  numbers.get(x+1) )
            {
                return numbers.get(x) + 1;
            }
        }

        return 0;



    }
}
