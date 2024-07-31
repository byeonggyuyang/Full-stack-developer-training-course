package ex03_operator;
import java.util.Scanner;



public class Ex08_Opoerator {

	public static void main(String[] args) {
		/*
        배, 사과, 오렌지 각각 5, 7, 5.
        하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균 생산 갯수. 
		*/
		
		int pear=5,apple=7,orange=5;
		
		int Total = pear+apple+orange;
		float avg = Total/24f;
		
		System.out.printf("총 개수 : %d\n",Total);
		System.out.printf("평균 값 : %f\n",avg);
		//-----------------------------------------------------//
		
		/*
		 상자 하나에 농구공 5개
		 농구공이 23개라면 몇개 상자가 필요한가
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("공 개수 입력 : ");
		
		int fullbox = 5;
		int ballnum = sc.nextInt();
		
		int box = ballnum % fullbox == 0 ? ballnum/fullbox : (ballnum/fullbox)+1;
		
		System.out.printf("필요한 상자 개수 : %d\n", box );
				
		//-----------------------------------------------------//
		/*
			국어 영어 수학 점수 입력받고
			세 과목 합계
			세 과목 평균 (합계 / 3.0)
			세 과목의 점수 평균 가지고 합격 여부 처리
			점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격 아니면 불합격
		*/
		
				
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg2 = (double)(sum/3.0);
		
		System.out.printf("과목합계 : %d\n, 과목평균 : %f\n", sum, avg2);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg2 >= 60 ) ? "합격" : "불합격";
		
		System.out.printf("%s\n", result);
		
		
		

	}

}
