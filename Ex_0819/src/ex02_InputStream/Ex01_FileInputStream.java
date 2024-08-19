package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_FileInputStream {

	public static void main(String[] args) {
		String path = "C:\\web0900_ybg\\01.java/test.txt";

		File f = new File(path);
		
		FileInputStream fis = null;
		if(f.exists()) {
			try 
			{
				fis = new FileInputStream(f);
				
				//한 바이트씩 읽어와서 담아줄 변수
				int code = 0;
				
				while((code - fis.read()) != -1) {
					System.out.println((char)code);
				}
				fis.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					fis.close();
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}

}
