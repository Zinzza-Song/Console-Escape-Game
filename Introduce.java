import java.util.Scanner;
public class Introduce {
	int select1, select2; // ���� ���� ����
	private int right1 = 1, right2 = 1; // �ݺ� ���� ���� ����(�ٱ����� ���� �Ұ��ϰ� ����)
	void intro1(){ // �� ó�� ���ù� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� ������ �����̾��� ��� ������ 4����"
				+"������ �ִ�. 4���� �ϳ��� ���ÿ�.(��, �ѹ� ���� ���Դϴ�!!)");
		System.out.println("1. �󱸰� 2. ���� 3. ���� 4. ��Ű");
		while(right1 == 1) // �ùٷ� �Է��� �� ���� ���� �ݺ�
		{
			select1 = sc.nextInt();
			if(select1 == 1)
				{
					System.out.println("�󱸰��� ���̱���. ^_^");
					right1 = 0;
				}
			else if(select1 == 2)
				{
					System.out.println("���ڸ� ���̱���!!!");
					right1 = 0;
				}
			else if(select1 == 3)
				{
					System.out.println("������ ���̱���. ^_^");
					right1 = 0;
				}
			else if(select1 == 4)
				{
					System.out.println("��Ű�� ���̱���. ^_^");
					right1 = 0;
				}
			// ������ ���̽����� Ȯ�� ���� ���� right1�� 0���� �ʱ�ȭ ��Ŵ���ν� ���� �ݺ����� ��������
			else
			{
				System.out.println("1~4 ���� ������ �Է��ϼ���!!!");
				System.out.println("�ٽ� �Է��Ͻÿ�.");
				continue;
				// �߸��Է��ϸ� �ٽ� ÷���� ���ư�����
			}
		}
	}
	void intro2(){ // ó�� ���� �� �ι�° ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������� ���� ��Ʈ�� �� ������Ʈ�� �� "
				+" �����Դϴ�.");
		System.out.println("1. A��Ʈ 2. B��Ʈ");
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
			// ������ ���̽����� Ȯ�� ���� ���� right2�� 0���� �ʱ�ȭ ��Ŵ���ν� ���� �ݺ����� ��������
			else
			{
				System.out.println("1~2 ���� ������ �Է��ϼ���!!!");
				System.out.println("�ٽ� �Է��Ͻÿ�.");
				continue;
				// �߸��Է��ϸ� �ٽ� ÷���� ���ư�����
			}
		}
	}
}