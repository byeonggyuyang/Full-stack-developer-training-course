package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex02_bingo {

	public static void main(String[] args) {
		//collections.shuffle(list) 숫자 섞어서 넣기
		HashSet<Integer> hs = new HashSet<>();
		
		
		int[][] board = new int[5][5];
		
		for(int i = 0; hs.size() < 25; i++)
		{
			hs.add(new Random().nextInt(50) + 1);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		
		Collections.shuffle(list);
		
		Iterator<Integer> iter = list.iterator();
		
		for(int j = 0; j < board.length; j++) 
		{
			for(int k = 0; k < board[j].length; k++)
			{
				board[j][k] = iter.next();
				System.out.printf("%02d\t",board[j][k]);
			}
			System.out.println();
		}

	}

}
