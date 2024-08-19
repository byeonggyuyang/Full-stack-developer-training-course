package ex01_file;

import java.io.File;
import java.util.Arrays;

public class Ex02_File {

	public static void main(String[] args) {
		String path ="C:\\web0900_ybg\\01.java";
		
		File f = new File(path);
		
		//isDirectory -> 경로의 최종 목적지가 폴더면 true
		if(f.isDirectory()) {
			//.list -> 경로의 하위 요소들을 문자열 배열로 변환
			String[] names = f.list();
			
			
			System.out.println(Arrays.toString(names));
		}
		
	
		

	}

}
