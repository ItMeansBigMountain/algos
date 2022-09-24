package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        int total = 0;
        for (int x = 0; x < numbers.length; x++) {
            total += numbers[x];
        }
        return total;
    }
}
