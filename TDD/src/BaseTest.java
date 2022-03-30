import org.junit.Before;


public class BaseTest {

	protected Calculator calculator;

	public BaseTest() {
		super();
	}

	@Before
	public void init() {
		calculator = new Calculator();
	}

}