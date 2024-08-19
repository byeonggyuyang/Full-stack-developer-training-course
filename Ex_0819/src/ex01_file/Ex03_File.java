package ex01_file;

import java.io.File;

public class Ex03_File {

	public static void main(String[] args) {
		String path ="C:\\web0900_ybg\\01.java/aaa/bbb";
		
		File f= new File(path);
		
		//파일 존재여부 확인
		if(f.exists() == false) {
			System.out.println("폴더생성");
			//file.mkdirs() -> 만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우, 상위 디렉토리까지 생성
			f.mkdirs();
			
			//file.mkdir() ->만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우, 생성 불가
	
		}
	}

}
