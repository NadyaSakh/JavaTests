package lesson1_1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Solution1_1Test {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private Solution1_1 solutionClass = new Solution1_1();
    private int[] arrAlternatingNumbers;
    private int[] arrNotAlternatingNumbersMiddle;
    private int[] arrNotAlternatingNumbersStart;
    private int[] arrNotAlternatingNumbersEnd;

    @Before
    public void setUpTestData() {
        arrAlternatingNumbers = new int[]{9, -4, 67, -2, 45, -1, 1, -23, 20, -10};
        arrNotAlternatingNumbersMiddle = new int[]{9, -4, 67, -2, 45, 1, 1, -23, 20, -10};
        arrNotAlternatingNumbersStart = new int[]{-9, -4, 67, -2, 45, -1, 1, -23, 20, -10};
        arrNotAlternatingNumbersEnd = new int[]{9, -4, 67, -2, 45, -1, 1, -23, 20, 10};
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testAllNumbersAlternating() {
        int actual = solutionClass.solution(arrAlternatingNumbers);
        int expected = 0;
        Assert.assertEquals("Result must be equal to 0.", actual, expected);
        Assert.assertEquals(expected,  Integer.parseInt(output.toString().trim()));
    }
    @Test
    public void testNotAlternatingNumberInMiddle() {
        int actual = solutionClass.solution(arrNotAlternatingNumbersMiddle);
        int expected = 5;
        Assert.assertEquals("Result must be equal to 5.", actual, expected);
        Assert.assertEquals(expected,  Integer.parseInt(output.toString().trim()));
    }

    @Test
    public void testNotAlternatingNumberInStart() {
        int actual = solutionClass.solution(arrNotAlternatingNumbersStart);
        int expected = 1;
        Assert.assertEquals("Result must be equal to 1.", actual, expected);
        Assert.assertEquals(expected,  Integer.parseInt(output.toString().trim()));
    }

    @Test
    public void testNotAlternatingNumberInEnd() {
        int actual = solutionClass.solution(arrNotAlternatingNumbersEnd);
        int expected = 9;
        Assert.assertEquals("Result must be equal to 9.", actual, expected);
        Assert.assertEquals(expected,  Integer.parseInt(output.toString().trim()));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}