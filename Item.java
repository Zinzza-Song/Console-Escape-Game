import java.util.*;
abstract class Item {
	void text(){};
} // text 메소드를 포함한 추상 메소드를 선언
class basketball extends Item{ // 추상메소드에서 상속 받음
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("처음에 농구공을 선택 하셨습니다.");
		System.out.println("농구장에서 김재훈이 다가오네요...");
		System.out.println("엔딩을 보려면 정수 1을 입력하십시오.");
		while(true) // 무한 반복
		{
			int a = sc.nextInt();
			if(a == 1)
			{
				Image i = new Image(a);
				break;
				// 올바로 입력 했을 경우 1번 이미지 출력
			}
			else
				{
					System.out.println("1을 제대로 입력하십시오!!!!");
					System.out.println("다시 입력하세요!!");
					continue;
					// 잘못 입력 했을 때 다시 입력받게 함
				}
		}
	}
}
class success extends Item{ // 추상메소드에서 상속 받음
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("처음에 모자를 선택 하셨습니다.");
		System.out.println("자 이제 학교를 빠져나가 볼까요?");
		System.out.println("엔딩을 보려면 정수 2를 입력하십시오.");
		while(true) // 무한 반복
		{
			int a = sc.nextInt();
			if(a == 2)
			{
				Image i = new Image(a);
				break;
				// 올바로 입력 했을 경우 2번 이미지 출력
			}
			else
				{
					System.out.println("2를 제대로 입력하십시오!!!!");
					System.out.println("다시 입력하세요!!");
					continue;
					// 잘못 입력 했을 때 다시 입력받게 함
				}
		}
	}
}
class wallet extends Item{ // 추상메소드에서 상속 받음
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("처음에 지갑을 선택 하셨습니다.");
		System.out.println("학교정문에 포돌이가 기다리고 있네요 지갑주인이"
				+ "분실신고를 했나봅니다...");
		System.out.println("엔딩을 보려면 정수 3을 입력하십시오.");
		while(true) // 무한 반복
		{
			int a = sc.nextInt();
			if(a == 3)
			{
				Image i = new Image(a);
				break;
				// 올바로 입력 했을 경우 3번 이미지 출력
			}
			else
				{
					System.out.println("3을 제대로 입력하십시오!!!!");
					System.out.println("다시 입력하세요!!");
					continue;
					// 잘못 입력 했을 때 다시 입력받게 함
				}
		}
	}
}
class carkey extends Item{ // 추상메소드에서 상속 받음
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("처음에 차키를 선택 하셨습니다.");
		System.out.println("곽한구가 어디서 익숙한 차를 끌고 당신 앞을 지나가"
				+ "네요");
		System.out.println("엔딩을 보려면 정수 4를 입력하십시오.");
		while(true) // 무한 반복
		{
			int a = sc.nextInt();
			if(a == 4)
			{
				Image i = new Image(a);
				break;
				// 올바로 입력 했을 경우 4번 이미지 출력
			}
			else
				{
					System.out.println("4를 제대로 입력하십시오!!!!");
					System.out.println("다시 입력하세요!!");
					continue;
					// 잘못 입력 했을 때 다시 입력받게 함
				}
		}
	}
}