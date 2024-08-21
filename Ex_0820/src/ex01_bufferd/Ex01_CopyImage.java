package ex01_bufferd;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImage {

	public static void main(String[] args) {
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		
		FileOutputStream writeFile = null;
		BufferedOutputStream bos = null;
		
		try 
		{
			readFile = new FileInputStream("C:\\web0900_ybg\\01.java/wall.jpg");
			writeFile = new FileOutputStream("C:\\web0900_ybg\\01.java/wall_copy3.jpg");
			
			bis = new BufferedInputStream(readFile);
			bos = new BufferedOutputStream(writeFile);
			
			int read = 0;
			
			while((read = bis.read()) != -1)
			{
				bos.write(read);
			}
		} 
		catch (Exception e) 
		{
			// 
		}
		finally 
		{
			try 
			{
				if (bis != null) {
					bis.close();
				}
				if (readFile != null) {
					readFile.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(writeFile != null) {
					writeFile.close();
				}
			} 
			catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}

	}

}
