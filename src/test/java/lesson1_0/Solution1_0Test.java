package lesson1_0;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Solution1_0Test {
    private Solution1_0 solution1_0;
    private double a;
    private double b;

    @Before
    public void setUp() {
        solution1_0 = new Solution1_0();
        a = 12.02;
        b = 4.0;
    }

    @Test
    public void sum() {
        double actual = solution1_0.sum(a, b);
        double expected = 160.4804;
        Assert.assertEquals("Result must be equal to 160.4804.",
                Double.doubleToLongBits(expected), Double.doubleToLongBits(actual));
    }

    @Test
    public void sub() {
        double actual = solution1_0.sub(a, b);
        double expected = 128.4804;
        Assert.assertEquals("Result must be equal to 128.4804.",
                Double.doubleToLongBits(expected), Double.doubleToLongBits(actual));
    }


    @Test
    public void mull() {
        double actual = solution1_0.mull(a, b);
        double expected = 2311.6864;
        Assert.assertEquals("Result must be equal to 2311.6864.",
                Double.doubleToLongBits(expected), Double.doubleToLongBits(actual));
    }


    @Test
    public void div() {
        double actual = solution1_0.div(a, b);
        double expected = 9.030025;
        Assert.assertEquals("Result must be equal to 9.030025.",
                Double.doubleToLongBits(expected), Double.doubleToLongBits(actual));

    }
}