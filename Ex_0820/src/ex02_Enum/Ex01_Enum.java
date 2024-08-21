package ex02_Enum;

import java.util.Arrays;

public class Ex01_Enum {

	public static void main(String[] args) {
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		for(Item item : items)
		{
			System.out.println("name = " +item.name() + ",ordinal =" + item.ordinal());
		}
		//valueOf() : 매개변수로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 반환
		Item i1 = Item.valueOf("Start");
		System.out.println(i1);
		
		Item i2 = Item.Start;
		System.out.println(i2);
		
		Item i3 = Item.Stop;
		//열거형 상수간의 비교는 == 사용가능
		System.out.println(i1 == i2);
		
		// < , > 비교연산자는 사용불가능 기준객체.compareTo(비교객체)로 사용 가능
		// 기준객체가 비교객체보다 순번이 빠르면 음수, 순번이 늦으면 양수
		System.out.println(i1.compareTo(i3));
		
		switch(i1)
		{
			case Start -> System.out.println("게임시작!");
			case Stop -> System.out.println("게임멈춤!");
			case Exit -> System.out.println("게임종료!");
		}
		
		//생성자가 private이기 때문에 열거형 객체를 직접 만드는것은 불가능함
		Season s = Season.Summer;
		System.out.println(s.name());
		System.out.println(s.getSeason());
	}

}
