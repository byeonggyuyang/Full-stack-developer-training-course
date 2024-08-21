package ex01_bufferd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_BufferedWriter {

	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		
		FileWriter writer = null;
		BufferedWriter bw = null;

		try 
		{
			reader = new FileReader("C:\\web0900_ybg\\01.java/book.txt");
			writer = new FileWriter("C:\\web0900_ybg\\01.java/book_copy.txt");
			
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			String str = "";
			
			while((str = br.readLine()) != null)
			{
				bw.write(str +"\n");
			}
			
			
		} 
		catch (Exception e) 
		{
			
		}
		finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(writer != null) {
					writer.close();
				}
				
				if(br != null) {
					br.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
