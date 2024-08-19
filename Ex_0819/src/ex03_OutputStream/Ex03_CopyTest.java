package ex03_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out =null;
		
		try 
		{
			in = new FileInputStream("C:\\web0900_ybg\\01.java/wall.jpg");
			out = new FileOutputStream("C:\\web0900_ybg\\01.java/wall_copy2.jpg");

			byte[] buffer = new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기");
			
			int read = 0;
			
			while((read = in.read(buffer)) != -1)
			{
				out.write(buffer,0,read);
			}
			
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end - start) / 1000;
			System.out.println(time + "초");
			
		} 
		catch (Exception e) 
		{
			
		}
		finally 
		{
			try 
			{
				if(out != null)
				{
					out.close();
				}
				
				if(in != null)
				{
					in.close();
				}
					
			}
			catch (Exception e2) 
			{
			
			}
		}

	}

}
