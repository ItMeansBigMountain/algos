package finishedAlgos;
import java.util.*;


class algo {

    public static int search(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return index;
    }

    // Main
    public static void main(String[] args) {

        int[] array = { 5 };
        System.out.println(search(array, 5));

    }

}