import java.io.IOException;

public class ExceptionsDemo {
	public static void main(String[] args) {
		Book book = new Book();
		try {
			book.setPrice(-1000);
		} catch (InvalidPriceException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
//runtime: unchecked
//compile-time : checked