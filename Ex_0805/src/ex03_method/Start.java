package ex03_method;

import java.util.Random;

public class Start {
	
	/*
	 1~50사이의 난수를 발생시킴
	 main에서 사용자가 키보드를 통해 정수를 입력받음
	 클래스에서 사용자가 입력한 숫자를 판단하여 
	 발생한 난수보다 크면 down 작으면 up
	 사용자가 입력한 숫자와 발생한 난수가 같으면 
	 프로그램 종료 및 몇회만에 맞췄는지 카운트
	*/
	Random rnd = new Random();
	
	int rnum = rnd.nextInt(50)+1;
	int count = 1;
	public String check(int number) {
		if(number == rnum) {
			return "정답!";
		} else if(number >rnum) {
			return "DOWN!";
		} else {
			return "UP!";
		}
	}
		
	
}
