
public class ForLoopDemo {
	public static void main(String[] args) {
//		usingForLoop();
		usingWhileLoop();
		usingDoWhileLoop();
	}

	private static void usingDoWhileLoop() {
		
	}

	private static void usingWhileLoop() {
//		??
	}

	private static void usingForLoop() {
		for (int row = 0; row < 5; row++) {
			for (int j = 0; j < row; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
