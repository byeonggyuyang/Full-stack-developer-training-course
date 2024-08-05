package ex04_array;
import java.util.Scanner;

public class Ex02_multi_array {

	public static void main(String[] args) {
		/*
		 1~25까지 2차원배열 arr에 순차적으로 넣고
		 한줄에 다섯개씩 출력하기
		 
		 01 02 03 04 05
		 ...
		 21 22 23 24 25
		 
		*/
		
		int [][] arr = new int[5][5];
		
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = cnt++;
				System.out.printf("%02d ",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		/*
		 로또번호 맞추기
		*/
		
		int[][] lotto = {{2,6,11,33,42,44}
						,{1,6,17,22,24,33}
		                ,{7,16,24,33,45,9}
		                ,{27,42,35,21,43,3}
		                ,{6,17,22,24,33,41}};
		
		//키보드에서 당첨숫자를 연속으로 6개를 입력받아 myNum에 넣는다.
		//2차원 배열에 들어있는 1차원배열 5개중 하나라도 완전히 일치하는
		//곳이 있으면 당첨 아니면 x
		Scanner sc = new Scanner(System.in);
		String myNum = "";
		
		boolean isWin = false;
		
		System.out.print("번호 입력 : ");
		
		
		myNum = sc.next();
		
		for(int i = 0; i < lotto.length; i++)
		{
			String lottoNum = "";
			for(int j = 0 ; j < lotto[i].length; j++)
			{
				lottoNum += lotto[i][j];
			}
			if(myNum.equals(lottoNum))
			{
				isWin = true;
				break;
			}
		}
		if(isWin)
		{
			System.out.println("당첨");
		}
		else 
		{
			System.out.println("떨");
		}
		
		
		}

	}



