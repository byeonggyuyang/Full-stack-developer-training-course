package ex02_scanner;
import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("나이를 입력해주세요 : ");
		
		int age = sc.nextInt();
		
		System.out.printf("제 나이는 %d세 입니다.\n",age);
		
		System.out.println("----------------------------\n");
		*/
		//이름,나이,주소,키
		
		String name, address;
		int age;
		double height;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.skip("\r\n");
		System.out.print("주소 : ");
		address = sc.nextLine();
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.printf("제 이름은 %s 입니다\n",name);
		System.out.printf("제 나이는 %d 입니다\n",age);
		System.out.printf("제 주소는 %s 입니다\n",address);
		System.out.printf("제 키는 %.1fcm 입니다\n",height);
	}

}
