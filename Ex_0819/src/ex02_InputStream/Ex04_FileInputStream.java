package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex04_FileInputStream {

	public static void main(String[] args) {
		String path = "C:\\web0900_ybg\\01.java/test.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null; 
		byte[] read = new byte[(int)f.length()];
		
		if(f.exists()) {
			try 
			{
				fis = new FileInputStream(f);
				fis.read(read);
				
				String ori = new String(read);
				String rev = "";
				
				for(int i = ori.length()-1; i>=0; i--) {
					rev+=ori.charAt(i);
				}
				
				if(ori.equals(rev)) {
					System.out.println("회문" + rev);
				}
				else
				{
					System.out.println( rev);
				}
					
				
				
			} 
			catch (Exception e) 
			{
			
			}

		}
				
		
	}

}
