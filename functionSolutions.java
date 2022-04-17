package finishedAlgos;
import java.util.*;

public class functionSolutions {

    // SORTING ARRAYS
    // takes parameter and returns int[] of sorted values
    public static int[] sorting_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    // FREQUENCY FINDER
    // DISPLAYS FREQUENCIES IN ARRAY
    public static int[] frequencies_of_values(int[] arr) {
        // find frequencies of all arrs
        int[] fr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }

        // Displays the frequency of each element present in array
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }

        return fr;
    }

    // FIND MOST FREQUENT INTEGER
        // returns int that was found the most in the int[]
    public static int most_frequent_int(int[] arr) {

        // intial array
        int max_element = 8;

        // declare an array of size max_element+1
        int count_arr[] = new int[max_element + 1];

        // loop through the original array and update the count
        for (int i = 0; i < arr.length; i++) {
            count_arr[arr[i]]++;
        }

        // fetch the element having the max count
        int max_repeated = Integer.MIN_VALUE;
        int max_count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count_arr[arr[i]] > max_count) {
                max_count = count_arr[arr[i]];
                max_repeated = arr[i];
            }
        }

        System.out.println("Most repeated: " + max_repeated);
        return max_repeated;
    }




    
}
