package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void add() {
		// arrange
		Calculator calc = new Calculator();
		int expected = 5+10;
		// act
		int actual = calc.add(5, 10);;
		// assert
		assertEquals(expected, actual);
	}
	@Test
	void subtract() {
		// arrange
		Calculator calc = new Calculator();
		int expected = 5-10;
		// act
		int actual = calc.subtract(5, 10);;
		// assert
		assertEquals(expected, actual);
	}
	@Test
	void multiply() {
		// arrange
		Calculator calc = new Calculator();
		int expected = 5*10;
		// act
		int actual = calc.multiply(5, 10);;
		// assert
		assertEquals(expected, actual);
	}
	@Test
	void divide() {
		// arrange
		Calculator calc = new Calculator();
		double expected = 5/10;
		// act
		double actual = calc.divide(5, 10);;
		// assert
		assertEquals(expected, actual);
	}

}
