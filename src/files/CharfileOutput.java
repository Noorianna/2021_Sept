package files;
import java.io.FileWriter;
import java.io.IOException;

public class CharfileOutput {
	public static void main(String[] args) throws Exception{
		
	
	FileWriter writer = new FileWriter("CharStreamFile.txt");
	
	String line1 = "Hi there, is is my first char stream file";
	String line2 = "\n this is my second line";
	String line3 = "\n Appended line";
	
	writer.write(line1);
	writer.write(line2);
	writer.append(line3);
	
	writer.close();
	
	System.out.println("Char stream file create");
	
}
}
