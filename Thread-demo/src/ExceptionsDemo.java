import java.io.IOException;

public class ExceptionsDemo {
	public static void main(String[] args) 
			throws IOException {
		Book book = new Book();
		book.setPrice(1000);
	}
}
//runtime: unchecked
//compile-time : checked