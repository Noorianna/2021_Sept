package files;
import java.io.File;
import java.io.IOException;
public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		
	// Create a file
			File myfile = new File("mynewfile.txt");
	
			System.out.println("File exists:" +   myfile.exists());
			
			boolean fc = myfile.createNewFile();
			System.out.println("File created ? " + fc);
			System.out.println("File exists:" +   myfile.exists());
			
			System.out.println("IS file:" +   myfile.isFile());
			System.out.println("Is directory:" +   myfile.isDirectory());
			
			System.out.println("path : " + myfile.getPath());
			System.out.println("parent : " + myfile.getParent());
			System.out.println("get absolute path : " + myfile.getAbsolutePath());
			System.out.println("absolute : " + myfile.isAbsolute());
			System.out.println("is hidden : " + myfile.isHidden());
			System.out.println("can read : " + myfile.canRead());
			System.out.println("can write : " + myfile.canWrite());
			System.out.println("set read only : " + myfile.setReadOnly());
			System.out.println("set writable : " + myfile.setWritable(true));
			
			File dest = new File("renamedfile.txt"); // rename
			myfile.renameTo(dest);
			
			File newdest = new File("D:\\SeleniumTraining\\workspace\\9PMSelenium\\movedfile.txt");
			dest.renameTo(newdest);
			
			newdest.delete();
			
			File mydir = new File("myfiledir");
			System.out.println("Dir exists:" +   mydir.exists());
			
			mydir.mkdir();
			System.out.println("Dir exists:" +   mydir.exists());
			System.out.println("IS file:" +   mydir.isFile());
			System.out.println("Is directory:" +   mydir.isDirectory());
			
			File multidir = new File("dir1\\dir2\\dir3");
			multidir.mkdirs();
			
			
			System.out.println("Files in the directory");
			File[] dirFiles = mydir.listFiles();
			for(File myfl : dirFiles) {
				System.out.println(myfl.getName());
				myfl.delete();
			}
			
			
		}

	}


