package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInputStream {

	public static void main(String[] args) {
		String path = "C:\\web0900_ybg\\01.java/test.txt";
		
		File f = new File(path);

		byte[] read = new byte[100];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(read);
				
				String res = new String(read);
				System.out.println(res);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
