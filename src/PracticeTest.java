import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    
    @Test
    void testMaxDiffPositiveAndNegativeSame() {
        int[] numbers = {8, 8, 8, 8};

        int actual = Practice.maxDiff(numbers);

        assertEquals(0, actual);
    }

    @Test
    void testBiggestWordWithLetter() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "hi", "howdy"));
        String result = Practice.longestWord(words, 'h');
        assertEquals("hello", result);
    }

    @Test
    void testDifferenceInNandM(){
        Set<String> words = new HashSet<>();
        words.add("string");
        words.add("another");
        words.add("greatest");
        words.add("i");
        words.add("makebelivetestword");

        int diff = Practice.differenceInNandM(words, 1, 9);

        assertEquals(3, diff);
    }

    @Test
    void testoddEven(){
        HashMap<Integer, Integer> nums = new HashMap<>();

        for(int i = 0; i < 10; i++)
        {
            nums.put(i, i);
        }

        int diff = Practice.evenOdd(nums);

        assertEquals(5, diff);
    }
    // TODO: Make tests for each problem you solve

    @Test
    void testSecondLargest(){
        HashMap<Integer, Integer> nums = new HashMap<>();

        for(int i = 0; i < 10; i++)
        {
            nums.put(i, i);
        }

        int second = Practice.secondLarge(nums);

        assertEquals(8, second);
    }
    
}


