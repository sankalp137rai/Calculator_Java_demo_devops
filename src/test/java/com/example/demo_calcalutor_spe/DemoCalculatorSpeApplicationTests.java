 package com.example.demo_calcalutor_spe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
public class DemoCalculatorSpeApplicationTests {

	private static final double DELTA = 1e-15;
	DemoCalculatorSpeApplication calculator = new DemoCalculatorSpeApplication();

	@Test
	public void factorialTruePositive() {
		assertEquals(720, calculator.fact(6), DELTA);
		assertEquals(1, calculator.fact(0), DELTA);
	}

	@Test
	public void factorialFalsePositive() {
		assertNotEquals(113, calculator.fact(5), DELTA);
		assertNotEquals(10, calculator.fact(6), DELTA);
	}

	@Test
	public void powerTruePositive() {
		assertEquals(81, calculator.power(3, 4), DELTA);
		assertEquals(25, calculator.power(5, 2), DELTA);
	}

	@Test
	public void powerFalsePositive() {
		assertNotEquals(6, calculator.power(2, 3), DELTA);
		assertNotEquals(-7, calculator.power(3, 3), DELTA);
	}

	@Test
	public void logTruePositive() {
		assertEquals(0, calculator.naturalLog(1), DELTA);
		assertEquals(1, calculator.naturalLog(2.718281828459045), DELTA);
	}

	@Test
	public void logFalsePositive() {
		assertNotEquals(60, calculator.naturalLog(2.4), DELTA);
		assertNotEquals(4.7, calculator.naturalLog(2.1), DELTA);
	}

	@Test
	public void squareRootTruePositive() {
		assertEquals(4, calculator.squareRoot(16), DELTA);
		assertEquals(6, calculator.squareRoot(36), DELTA);
	}

	@Test
	public void squareRootFalsePositive() {
		assertNotEquals(1, calculator.squareRoot(3), DELTA);
		assertNotEquals(4, calculator.squareRoot(81), DELTA);
	}
}
