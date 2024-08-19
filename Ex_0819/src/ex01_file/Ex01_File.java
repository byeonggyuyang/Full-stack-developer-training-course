package ex01_file;

import java.io.File;

public class Ex01_File {

	public static void main(String[] args) {
		String path ="C:\\web0900_ybg\\01.java/test.txt";
		
		File f = new File(path);
		
		//isFile() -> 파일클래스가 접근한 최종목적지가 파일형태일경우 true
		
		if(f.isFile()) {
			System.out.println(f.length() + "byte");
		}
		
		
		
		
	}

}
