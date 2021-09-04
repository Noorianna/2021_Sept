package files;

import java.io.FileReader;
import java.io.FileWriter;

public class Charfile {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("CharStreamFile.txt");
		FileWriter writer = new FileWriter("CopiedCharStreamFile.txt");
		
		int myChar = reader.read();
		while(myChar!=-1) {
			writer.write(myChar);
			myChar = reader.read();
		}
		writer.append("\n This is my first new appended line");
		writer.append("\n This is my second new appended line");
		writer.close();
		reader.close();
		System.out.println("Char stream file copied");
		
	}
}
