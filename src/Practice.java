import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int diff = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < lowest)
            {
                lowest = nums[i];
            } else if(nums[i] > max) {
                max = nums[i];
            }

            diff = max - lowest;
        }
        
        // TODO: implement this
        return diff;
    }

    public static String longestWord(ArrayList<String> words, char target){
        String word = "";

        for (String string : words) {
            if(string.length() > word.length() && string.charAt(0) == target){
                word = string;
            }
        }

        return word;
    }

    public static int differenceInNandM(Set<String> words, int n, int m) {
        int diff = 0;

        for (String string : words) {
            if(string.length() > n && string.length() < m)
            {
                diff++;
            }
        }

        return diff;
    }
    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}