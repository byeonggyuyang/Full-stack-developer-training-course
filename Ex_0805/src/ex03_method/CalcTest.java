package ex03_method;

public class CalcTest {
	
	//메인에서 숫자 두개랑 산술연사자를 전달받아서 계산해서 반환
	int result;
	
	//반환값이 int라서 int로 해줌
	int getResult(int fNum, int eNum, String op) {
		
		switch(op) {
		case "+" -> result = fNum + eNum;
		case "-" -> result = fNum - eNum;
		case "*" -> result = fNum * eNum;
		case "/" -> result = fNum / eNum;
		}
		return result;
	}

}
