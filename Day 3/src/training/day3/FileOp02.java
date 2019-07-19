package training.day3;

import java.io.File;

public class FileOp02 {
	public static void main(String[] args) {
		File f = new File("same");
		System.out.println(f.isDirectory());
		
		File [] listFiles = f.listFiles();
		
		for(File temp : listFiles) {
			System.out.println(temp.getName());
		}
		if(f.canWrite())
			System.out.println(temp.getName());
		
	}

}
