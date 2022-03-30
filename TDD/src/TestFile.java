import org.junit.Test;

public class TestFile extends BaseTest{
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		calculator.divide(2, 0);
	}
	
}
