package test;

import main.BalancedBrackets;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    private static int testCount = 0;

    @BeforeClass
    public static void setup() {
        System.out.println("Unit tests starting:");
    }

    @After
    public void message() {
        System.out.println("Test " + ++testCount + " complete.");
    }

    @AfterClass
    public static void closing() {
        System.out.println("Total of " + testCount + " tests complete.");
    }

    @Test
    public void onlyOrderedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void singleCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void mixedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}][][floof]"));
    }

    @Test
    public void mixedUnbalancedOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[bl[ue]"));
    }

    @Test
    public void mixedUnbalancedCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[bl]ue]"));
    }

    @Test
    public void insetBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[t[r]y]"));
    }

    @Test
    public void unorderedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
