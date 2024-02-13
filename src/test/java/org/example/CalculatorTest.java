package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }
    /**
     * Test square root function
     */
    public void testSquareRoot()
    {
        assertEquals(2.0, Calculator.squareRoot(4.0), 0.0001);
        assertEquals(3.0, Calculator.squareRoot(9.0), 0.0001);
        assertEquals(0.0, Calculator.squareRoot(0.0), 0.0001);
    }

    /**
     * Test factorial function
     */
    public void testFactorial()
    {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
    }

    /**
            * Test natural logarithm function
     */
    public void testNaturalLogarithm()
    {
        assertEquals(1.6094, Calculator.naturalLogarithm(5.0), 0.0001);
        assertEquals(Double.NEGATIVE_INFINITY, Calculator.naturalLogarithm(0.0));
        assertEquals(Double.NaN, Calculator.naturalLogarithm(-5.0));
    }

    /**
     * Test power function
     */
    public void testPowerFunction()
    {
        assertEquals(8.0, Calculator.powerFunction(2.0, 3.0), 0.0001);
        assertEquals(1.0, Calculator.powerFunction(5.0, 0.0), 0.0001);
        assertEquals(0.0, Calculator.powerFunction(0.0, 5.0), 0.0001);
        assertEquals(1.0, Calculator.powerFunction(0.0, 0.0), 0.0001);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
