package files;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Create a new file using Byte Stream, read text 
//from keyboard/console and write to file until “end” is 
public class Assignment1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	DataInputStream dis=new DataInputStream(System.in);
		  
		FileOutputStream out = new FileOutputStream("ByteOutFile.txt");
		try {
			DataInputStream dis=new DataInputStream(System.in);
				
		//	out.write(dis);
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			out.close();
		}
		System.out.println("File Created");
	}

}
