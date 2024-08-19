package ex04_Reader;

import java.io.FileReader;

public class Ex02_FileReader {

	public static void main(String[] args) {
		int upper = 0;
		int lower = 0;
		try{
			FileReader fr = new FileReader("C:\\web0900_ybg\\01.java/test.txt");
			int code = 0;
				while((code = fr.read()) != -1) {
					if(code >= 'A' && code <= 'Z') {
						upper++;
					}

					if( code >='a' && code <='z') {
						lower++;
					}

				}//while
				System.out.println("대문자: " + upper);
				System.out.println("소문자: " + lower);

				fr.close();
			} catch(Exception e) {

			}
	}

}
