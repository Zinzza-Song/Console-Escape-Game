import java.util.*;
abstract class Question {
	void text(){};
} // text메소드가 있는 추상 클래스 선언
class question1 extends Question{ // 추상 메소드에서 상속 받음
	int a1, a2; // 각각의 정답을 저장하기 위한 변수 선언
	private int chance = 3; // 기회 3번 부여(기회가 0번이면 실패)
	void text(){ // A세트 문제
		Scanner sc = new Scanner(System.in);
		System.out.println("2문제 짜리 힌트를 고르셨군요!");
		System.out.println("2문제를 풀면 각각의 정답이 자동 합산기에 입력"
				+ "되어 패스워드가 나타납니다.");
		while(chance != 0) // chance가 0이 아닐 때 까지 반복
		{
			System.out.println("1번 문제");
			System.out.println("14학번 컴소과 학생들의 학번에 공통으로 들어"
					+ "가는 수는?");
			a1 = sc.nextInt(); // 1번 답 입력
			System.out.println("당신이 입력한 답 : " + a1); // 1번 답을 입력한 결과를 출력
			System.out.println();
			System.out.println("2번 문제");
			System.out.println("14학번 컴소과 학생들 중 가장 최근에 태어난"
					+ " 학생의 태어난 연도는?");
			a2 = sc.nextInt(); // 2번 답 입력
			System.out.println("당신이 입력한 답 : " + a2); // 2번 답을 입력한 결과를 출력
			System.out.println();
			Outosolve os = new Outosolve(a1, a2); // 입력한 두문제의 답을 자동 계산
			System.out.println("당신이 입력한 두개의 답을 계산한 결과 : "
			+ os.getanswer()); // 계산 결과를 출력
			System.out.println("패스워드를 입력하십시오.");
			long answer = sc.nextLong(); // 계산 결과(패스워드)를 직접 입력
			if(answer == 2016026) // 패스워드를 제대로 입력한 경우
			{
				chance = 0; // 반복을 끊기 위해 chance에 0을 대입
				System.out.println("어디선가 띡띡띡 소리가 납니다.");
				System.out.println("엔딩을 보려면 정수 5를 입력하십시오.");
				while(true) // 무한 반복
				{
					int a = sc.nextInt();
					if(a == 5)
					{
						Image i = new Image(a);
						return;
						// 제대로 입력하였으면 5번 이미지를 출력하고 종료
					}
					else
						{
							System.out.println("5를 제대로 입력하십시오!!!!");
							System.out.println("다시 입력하세요!!");
							continue;
							// 다시 입력하게함
						}
				}
			}
			else // 패스워드가 제대로 입력하지 않은 경우
			{
				chance -= 1; // chance 1번 까버림
				System.out.println("남은 기회는"+chance+"번 남았습니다."+
				" 처음 부터 다시 푸세요!!"); // 남은 기회 출력
				if(chance == 0) // 기회가 0번일 경우
				{
					System.out.println("어디선가 띡띡띡 소리가 납니다.");
					System.out.println("엔딩을 보려면 정수 5를 입력하십시오.");
					while(true) // 무한 반복
					{
						int a = sc.nextInt();
						if(a == 5)
						{
							Image i = new Image(a);
							return;
							// 제대로 입력하였으면 5번 이미지를 출력하고 종료
						}
						else
							{
								System.out.println("5를 제대로 입력하십시오!!!!");
								System.out.println("다시 입력하세요!!");
								continue;
								// 다시입력하게 함
							}
					}
				}
				else
					continue;
				// chance가 0이 아닐 경우 처음으로 간다.
			}
		}
	}
}
class question2 extends Question{
	int a1, a2, a3; // 각가의 정답을 저장할 변수 선언
	private int chance = 3; // 기회 3번
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("3문제 짜리 힌트를 고르셨군요!");
		System.out.println("3문제를 풀면 각각의 정답이 자동 계산기에 입력"
				+ "되어 계산해주고 패스워드를 보여줍니다.");
		while(true) // 무한 반복
		{
			System.out.println("1번 문제");
			System.out.println("14학번 컴소과 학생들의 학번에 공통으로 들어"
					+ "가는 수는?");
			a1 = sc.nextInt(); // 1번 답을 입력
			System.out.println("당신이 입력한 답 : " + a1); // 1번 답을 입력한 결과 출력
			System.out.println();
			System.out.println("2번 문제");
			System.out.println("14학번 컴소과 학생들 중 가장 최근에 태어난"
					+ " 학생의 태어난 연도는?");
			a2 = sc.nextInt(); // 2번 답을 입력
			System.out.println("당신이 입력한 답 : " + a2); // 2번 답을 입력한 결과 출력
			System.out.println();
			System.out.println("3번 문제");
			System.out.println("하나님, 이케르카시야스, 독일, 금메달 여기서"
					+"연상되는 숫자는?");
			a3 = sc.nextInt(); // 3번 답을 입력
			System.out.println("당신이 입력한 답 : " + a3); // 3번 답을 입력한 결과 출력
			System.out.println();
			Outosolve os = new Outosolve(a1, a2, a3);
			System.out.println("당신이 입력한 세개의 답을 계산한 결과 : "
					+ os.getanswer()); // 3개의 답을 자동 계산한 값을 출력
			System.out.println("패스워드를 입력하십시오.");
			long answer = sc.nextLong(); // 패스워드 입력
			if(answer == 2016025)
			{
				System.out.println("과실 문이 열렸습니다!!!!");
				System.out.println("과실 문 밖에 숫자가 쓰여져 있습니다."
						+" 갈멜관 비밀번호는 114");
				System.out.println("갈멜과 비밀 번호를 입력하시오.");
				break;
				// 올바르게 입력한 경우 반복 종료
			}
			else // 올바르게 입력하지 못할 경우
			{
				chance -= 1; // 할 때 마다 chance를 1씩 뺌
				System.out.println("남은 기회는"+chance+"번 남았습니다."+
						" 처음 부터 다시 푸세요!!"); // 남은 기회 출력
					if(chance == 0) // chance가 0일 때 
					{
						System.out.println("어디선가 띡띡띡 소리가 납니다.");
						System.out.println("엔딩을 보려면 정수 5를 입력하십시오.");
						while(true)// 무한 반복
						{
							int a = sc.nextInt();
							if(a == 5)
							{
								Image i = new Image(a);
								return;
								// 제대로 입력한 경우 5번 이미지를 출력하고 종료
							}
							else
								{
									System.out.println("5를 제대로 입력하십시오!!!!");
									System.out.println("다시 입력하세요!!");
									continue;
									// 다시 입력하게 함
								}
						}
					}
				else
					continue;
					// chance가 0이 아닐경우 반복
			}
		}
	}
}