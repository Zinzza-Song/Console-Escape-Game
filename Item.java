import java.util.*;
abstract class Item {
	void text(){};
} // text �޼ҵ带 ������ �߻� �޼ҵ带 ����
class basketball extends Item{ // �߻�޼ҵ忡�� ��� ����
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ó���� �󱸰��� ���� �ϼ̽��ϴ�.");
		System.out.println("���忡�� �������� �ٰ����׿�...");
		System.out.println("������ ������ ���� 1�� �Է��Ͻʽÿ�.");
		while(true) // ���� �ݺ�
		{
			int a = sc.nextInt();
			if(a == 1)
			{
				Image i = new Image(a);
				break;
				// �ùٷ� �Է� ���� ��� 1�� �̹��� ���
			}
			else
				{
					System.out.println("1�� ����� �Է��Ͻʽÿ�!!!!");
					System.out.println("�ٽ� �Է��ϼ���!!");
					continue;
					// �߸� �Է� ���� �� �ٽ� �Է¹ް� ��
				}
		}
	}
}
class success extends Item{ // �߻�޼ҵ忡�� ��� ����
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ó���� ���ڸ� ���� �ϼ̽��ϴ�.");
		System.out.println("�� ���� �б��� �������� �����?");
		System.out.println("������ ������ ���� 2�� �Է��Ͻʽÿ�.");
		while(true) // ���� �ݺ�
		{
			int a = sc.nextInt();
			if(a == 2)
			{
				Image i = new Image(a);
				break;
				// �ùٷ� �Է� ���� ��� 2�� �̹��� ���
			}
			else
				{
					System.out.println("2�� ����� �Է��Ͻʽÿ�!!!!");
					System.out.println("�ٽ� �Է��ϼ���!!");
					continue;
					// �߸� �Է� ���� �� �ٽ� �Է¹ް� ��
				}
		}
	}
}
class wallet extends Item{ // �߻�޼ҵ忡�� ��� ����
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ó���� ������ ���� �ϼ̽��ϴ�.");
		System.out.println("�б������� �����̰� ��ٸ��� �ֳ׿� ����������"
				+ "�нǽŰ� �߳����ϴ�...");
		System.out.println("������ ������ ���� 3�� �Է��Ͻʽÿ�.");
		while(true) // ���� �ݺ�
		{
			int a = sc.nextInt();
			if(a == 3)
			{
				Image i = new Image(a);
				break;
				// �ùٷ� �Է� ���� ��� 3�� �̹��� ���
			}
			else
				{
					System.out.println("3�� ����� �Է��Ͻʽÿ�!!!!");
					System.out.println("�ٽ� �Է��ϼ���!!");
					continue;
					// �߸� �Է� ���� �� �ٽ� �Է¹ް� ��
				}
		}
	}
}
class carkey extends Item{ // �߻�޼ҵ忡�� ��� ����
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ó���� ��Ű�� ���� �ϼ̽��ϴ�.");
		System.out.println("���ѱ��� ��� �ͼ��� ���� ���� ��� ���� ������"
				+ "�׿�");
		System.out.println("������ ������ ���� 4�� �Է��Ͻʽÿ�.");
		while(true) // ���� �ݺ�
		{
			int a = sc.nextInt();
			if(a == 4)
			{
				Image i = new Image(a);
				break;
				// �ùٷ� �Է� ���� ��� 4�� �̹��� ���
			}
			else
				{
					System.out.println("4�� ����� �Է��Ͻʽÿ�!!!!");
					System.out.println("�ٽ� �Է��ϼ���!!");
					continue;
					// �߸� �Է� ���� �� �ٽ� �Է¹ް� ��
				}
		}
	}
}