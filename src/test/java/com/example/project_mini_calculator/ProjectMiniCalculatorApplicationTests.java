package com.example.project_mini_calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProjectMiniCalculatorApplicationTests {

	ProjectMiniCalculatorApplication calculatorApplication = new ProjectMiniCalculatorApplication();
//	@Test
//    void testSquareRoot() {
//        ProjectMiniCalculatorApplication calculatorApplication = new ProjectMiniCalculatorApplication();
//        assertEquals(5.0,calculatorApplication.squareRoot(25.0));
//    }

	@Test
	void testSquareRoot() {
		assertEquals(5.0, calculatorApplication.squareRoot(25.0));
		assertEquals(0.0, calculatorApplication.squareRoot(0.0));
	}

	@Test
	void testFactorial() {
		assertEquals(1, calculatorApplication.factorial(0));
		assertEquals(1, calculatorApplication.factorial(1));
		assertEquals(24, calculatorApplication.factorial(4));
		assertEquals(120, calculatorApplication.factorial(5));
	}

	@Test
	void testNaturalLogarithm() {
		// Logarithm of negative number is undefined
		assertEquals(Double.NaN, calculatorApplication.naturalLogarithm(-1.0));
		assertEquals(1.0, calculatorApplication.naturalLogarithm(Math.E));
	}

	@Test
	void testPowerFunction() {
		assertEquals(8.0, calculatorApplication.powerFunction(2.0, 3.0));
		assertEquals(0.25, calculatorApplication.powerFunction(2.0, -2.0));
	}

}
