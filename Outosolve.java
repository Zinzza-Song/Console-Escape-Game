public class Outosolve{
	private int total; // 결과를 저장할 변수 선언(다른 곳에서 변경 못하게 선언)
	Outosolve(int a1, int a2){ // 생성자 오버로딩
		answer1(a1, a2);
	}
	private void answer1(int a1,int  a2){ // 메소드 오버로딩
		total = a1 + a2; // 2가지 계산하는 경우 계산 실행
	}
	Outosolve(int a1, int a2, int a3){
		answer2(a1, a2, a3);
	}
	private void answer2(int a1, int a2, int a3){
		total = a1 + a2 - a3; // 3가지 계산하는 경우 계산 실행
	}
	public int getanswer(){
		return total;
	}
}