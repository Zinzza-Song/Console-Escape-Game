import java.util.Scanner;
public class Introduce {
	int select1, select2; // 선택 변수 선언
	private int right1 = 1, right2 = 1; // 반복 조건 변수 선언(바깥에서 변경 불가하게 선언)
	void intro1(){ // 맨 처음 선택문 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 눈을 떠보니 과실이었고 당신 주위에 4가지"
				+"물건이 있다. 4개중 하나를 고르시오.(단, 한번 고르면 끝입니다!!)");
		System.out.println("1. 농구공 2. 모자 3. 지갑 4. 차키");
		while(right1 == 1) // 올바로 입력할 때 까지 무한 반복
		{
			select1 = sc.nextInt();
			if(select1 == 1)
				{
					System.out.println("농구공을 고르셨군요. ^_^");
					right1 = 0;
				}
			else if(select1 == 2)
				{
					System.out.println("모자를 고르셨군요!!!");
					right1 = 0;
				}
			else if(select1 == 3)
				{
					System.out.println("지갑을 고르셨군요. ^_^");
					right1 = 0;
				}
			else if(select1 == 4)
				{
					System.out.println("차키를 고르셨군요. ^_^");
					right1 = 0;
				}
			// 각각의 케이스마다 확인 글을 띄우고 right1을 0으로 초기화 시킴으로써 무한 반복에서 빠져나감
			else
			{
				System.out.println("1~4 중의 정수로 입력하세요!!!");
				System.out.println("다시 입력하시오.");
				continue;
				// 잘못입력하면 다시 첨으로 돌아가게함
			}
		}
	}
	void intro2(){ // 처음 선택 후 두번째 선택 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("물건을 고르셨으면 이제 힌트를 줄 문제세트를 고를 "
				+" 차례입니다.");
		System.out.println("1. A세트 2. B세트");
		while(right2 == 1)
		{
			select2 = sc.nextInt();
			if(select2 == 1)
			{
				question1 A = new question1();
				A.text();
				right2 = 0;
			}
			else if(select2 == 2)
			{
				question2 B = new question2();
				B.text();
				right2 = 0;
			}
			// 각각의 케이스마다 확인 글을 띄우고 right2를 0으로 초기화 시킴으로써 무한 반복에서 빠져나감
			else
			{
				System.out.println("1~2 중의 정수로 입력하세요!!!");
				System.out.println("다시 입력하시오.");
				continue;
				// 잘못입력하면 다시 첨으로 돌아가게함
			}
		}
	}
}