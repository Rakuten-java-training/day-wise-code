
public class Shop {
	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.setPrice(-123.6F);
//		b1.price=-100.8F;
		System.out.println(b1.getPrice());
		
		createBooks();
	}

	private static void createBooks() {
		//for loop, array of 10 book objects
	}
}
