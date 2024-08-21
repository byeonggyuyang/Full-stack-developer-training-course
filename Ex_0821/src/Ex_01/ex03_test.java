package Ex_01;

import java.util.Random;

public class ex03_test {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt((4990) + 10) / 10 * 10;
		
		int[] coins = {500,100,50,10};
		
		int[] coinCount = new int[4];
		
		System.out.println(n + "원");
		
		for(int i = 0; i < coins.length; i++)
		{
			coinCount[i] = n / coins[i];
			n %= coins[i];
        }
		
        System.out.println("500원: " + coinCount[0] + "개");
        System.out.println("100원: " + coinCount[1] + "개");
        System.out.println("50원: " + coinCount[2] + "개");
        System.out.println("10원: " + coinCount[3] + "개");
	}

}
