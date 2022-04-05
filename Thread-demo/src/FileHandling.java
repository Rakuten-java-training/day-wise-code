import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		readfile();
		writefile("output.txt", "this is some text");
	}
	
	private static void readfile() throws IOException {
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		System.out.println(line);
		
	}
	
	private static void writefile(String file, String data) {
		// TODO Auto-generated method stub
		
		??

	}
}
