import java.util.*;
public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Introduce I = new Introduce(); // Introduce Ŭ���� ȣ��
		I.intro1(); // IntroduceŬ���������� intro1�޼ҵ� ȣ��
		I.intro2(); // IntroduceŬ���������� intro2�޼ҵ� ȣ��
		while(true) // ���� �ݺ�
		{
			int a = sc.nextInt();
			if(a == 114) // 114�� �Է��� ���
				{
					if(I.select1 == 1)
						{
							basketball bs = new basketball();
							bs.text();
							// ó�� ���ÿ��� �󱸰��� ����� �� �󱸰��� ���� ��� �̹��� ���
						}
					else if(I.select1 == 2)
						{
							success su = new success();
							su.text();
							// ó�� ���ÿ��� ���ڸ� ����� �� ���ڿ� ���� ��� �̹��� ���
						}
					else if(I.select1 == 3)
						{
							wallet wa = new wallet();
							wa.text();
							// ó�� ���ÿ��� ������ ����� �� ������ ���� ��� �̹��� ���
						}
					else if(I.select1 == 4)
						{
							carkey ck = new carkey();
							ck.text();
							// ó�� ���ÿ��� ��Ű�� ����� �� ��Ű�� ���� ��� �̹��� ���
						}
				}
		else
			{
				System.out.println("�ٽ� �Է��ϼ���!!!!!");
				continue;
				// �߸��Է��� ��� �ٽ� �Է¹ް���
			}
		}
	}
}