import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest extends BaseTest {
	@Test
	public void testSubtract() {
		int result = calculator.subtract(2, 1);
		assertEquals(1, result);
	}

	@Test
	public void testDivide() {
		int result = calculator.divide(2, 1);
		assertEquals(2, result);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		calculator.divide(2, 0);
	}
	
	@Test
	public void testAdd() {
//		A-arrange, A-Act, A-assert

		int result = calculator.add(1, 2);// act
		assertEquals(3, result);
	}

	@Test
	public void testAddWithZero() {
		int result = calculator.add(0, 2);// act
		assertEquals(2, result);
	}
}
