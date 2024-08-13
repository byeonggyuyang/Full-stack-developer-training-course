package ex03_String;

import java.util.Scanner;

public class Ex04_String {

	public static void main(String[] args) {
		/*
		 주민번호입력 -포함
		 980614-1111111
		 xxxx년xx월xx에 태어난 사람
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력(-포함) : ");
		
		String id = "";
		
		id = sc.next();
		
		if (id.trim().length() < 14 || id.trim().charAt(6) != '-')
		{
			System.out.println("주민번호 형식 틀림");
		}
		else 
		{
			String year = id.substring(0, 2);
			String month = id.substring(2, 4);
			String day = id.substring(4, 6);;
			String res = "";
			
			
			if(Integer.parseInt(year) > 25) {
				res = "19";
			}
			else {
				res = "20";
			}
			
			res += year +"년"+ month +"월"+ day +"일";
			
			
			if(id.trim().charAt(7) % 2 != 0)
			{
				res += "남자입니다";
			}
			else 
			{
				res += "여자입니다";
			}
			System.out.println(res);
		}

	}

}
