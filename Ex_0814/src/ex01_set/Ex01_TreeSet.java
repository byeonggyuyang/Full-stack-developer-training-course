package ex01_set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex01_TreeSet {
	public static void main(String[] args) {
		//TreeSet객체 생성
		TreeSet<Integer> set1 = new TreeSet<>();
		//set1의 모든 값을 가진 TreeSet객체 생성
		TreeSet<Integer> set2 = new TreeSet<>(set1);
		//초기값을 가지고 만들어지는 TreeSet객체
		TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1,2,3));
	
		TreeSet<Integer> set = new TreeSet<>();
		
		//TreeSet에 값 추가하기
		set.add(7);
		
		//TreeSet 값 삭제하기
		set.remove(1);
		set.clear();
		System.out.print(set);
		
		TreeSet<Integer> set4 = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(set4.size());
		
		//TreeSet값 출력
		System.out.println(set4); //전체출력
		System.out.println(set4.first());//최소값 출력
		System.out.println(set4.last());//최대값 출력
		System.out.println(set4.higher(3));//입력값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println(set4.lower(3));//입력값보다 작은 데이터중 최대값 출력 없으면 null
		
		//index가 없기 때문에 하나씩 못꺼냄
		//Iterator를 사용하면 꺼낼 수 있음
		Iterator iter = set4.iterator();
		while(iter.hasNext()) //값이 있으면 true 없으면 false
		{
			System.out.println(iter.next());
		}
		
		
		
		
		
	}
}
