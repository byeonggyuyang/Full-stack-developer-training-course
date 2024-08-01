package ex02_for;



public class Ex02_for {

	public static void main(String[] args) {
		
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j < 4; j++)
			{
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("\n-----------------------------------");
		
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		int cnt =0;
		
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				System.out.printf("%02d ", ++cnt);
			}
			System.out.println();
		}
		
//		for(int i = 1; i < 4; i++)
//		{
//			for(int j = 1; j<=4; j++)
//			{
//				cnt++;
//				if(cnt < 10)
//				{
//					System.out.print("0" + cnt +" ");
//				}
//				else 
//				{
//					System.out.print(cnt + " ");
//				}
//			}
//			System.out.println();
//		}
		
		System.out.println("-----------------------------------");
		
		char eng = 'A';
		
		for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j<=4; j++)
			{
				System.out.printf("%s ", eng++);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5;j++)
			{
				if(i>=j) 
				{
					System.out.print("* ");
				}
				System.out.print("");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------------------");
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 4 5 6 7 8 9 10 1 2 3
		
		for(int i = 1; i < 11; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				int num = i+j;
				
				if(num > 10)
				{
					num -= 10;
				}
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		int k = 1;
		
		for(int i = 1; i < 11; i++)
		{
			k = i;
			for(int j = 1; j <= 10; j++)
			{
				System.out.print(k+" ");
				k++;
				if(k==11) 
				{
					k = 1;
				}
			}

			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
