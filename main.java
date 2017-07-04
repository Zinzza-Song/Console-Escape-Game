import java.util.*;
public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Introduce I = new Introduce(); // Introduce 클래스 호출
		I.intro1(); // Introduce클래스내에서 intro1메소드 호출
		I.intro2(); // Introduce클래스내에서 intro2메소드 호출
		while(true) // 무한 반복
		{
			int a = sc.nextInt();
			if(a == 114) // 114를 입력한 경우
				{
					if(I.select1 == 1)
						{
							basketball bs = new basketball();
							bs.text();
							// 처음 선택에서 농구공을 골랐을 때 농구공에 대한 결과 이미지 출력
						}
					else if(I.select1 == 2)
						{
							success su = new success();
							su.text();
							// 처음 선택에서 모자를 골랐을 때 모자에 대한 결과 이미지 출력
						}
					else if(I.select1 == 3)
						{
							wallet wa = new wallet();
							wa.text();
							// 처음 선택에서 지갑을 골랐을 때 지갑에 대한 결과 이미지 출력
						}
					else if(I.select1 == 4)
						{
							carkey ck = new carkey();
							ck.text();
							// 처음 선택에서 차키를 골랐을 때 차키에 대한 결과 이미지 출력
						}
				}
		else
			{
				System.out.println("다시 입력하세요!!!!!");
				continue;
				// 잘못입력한 경우 다시 입력받게함
			}
		}
	}
}