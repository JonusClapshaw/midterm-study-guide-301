import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

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

    
    // TODO: Make tests for each problem you solve
    
}


