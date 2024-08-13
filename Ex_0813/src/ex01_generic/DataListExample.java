package ex01_generic;

public class DataListExample {

	public static void main(String[] args) {
		//DataList객체 생성하기 변수명은 list
		DataList<Integer> list = new DataList();
		
		//정수입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//문자열저장
		//list.add("문자열");
		
		//실수저장
		//list.add(10.33);
		
		//데이터 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	
	}

}
