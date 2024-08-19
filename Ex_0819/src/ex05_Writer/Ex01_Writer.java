package ex05_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01_Writer {

	public static void main(String[] args) {
		try
		{
			FileWriter fw = new FileWriter("C:\\web0900_ybg\\01.java/fileWriter예제.txt");
			
			
			fw.write("첫번째 줄 작성합니다 ");
			fw.write("\n");
			fw.write("두번째 줄도 문제없지 hehehe");

			fw.close();
		} 
		catch ( IOException e) 
		{
			e.printStackTrace();
		}
	}

}
