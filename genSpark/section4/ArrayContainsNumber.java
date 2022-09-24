package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class ArrayContainsNumber implements Assignment {
    public boolean solution(int[] nums, int num) {
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == num) return true;
        }
        return false;
    }
}
