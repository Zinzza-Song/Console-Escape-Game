import java.util.*;
abstract class Question {
	void text(){};
} // text�޼ҵ尡 �ִ� �߻� Ŭ���� ����
class question1 extends Question{ // �߻� �޼ҵ忡�� ��� ����
	int a1, a2; // ������ ������ �����ϱ� ���� ���� ����
	private int chance = 3; // ��ȸ 3�� �ο�(��ȸ�� 0���̸� ����)
	void text(){ // A��Ʈ ����
		Scanner sc = new Scanner(System.in);
		System.out.println("2���� ¥�� ��Ʈ�� ���̱���!");
		System.out.println("2������ Ǯ�� ������ ������ �ڵ� �ջ�⿡ �Է�"
				+ "�Ǿ� �н����尡 ��Ÿ���ϴ�.");
		while(chance != 0) // chance�� 0�� �ƴ� �� ���� �ݺ�
		{
			System.out.println("1�� ����");
			System.out.println("14�й� �ļҰ� �л����� �й��� �������� ���"
					+ "���� ����?");
			a1 = sc.nextInt(); // 1�� �� �Է�
			System.out.println("����� �Է��� �� : " + a1); // 1�� ���� �Է��� ����� ���
			System.out.println();
			System.out.println("2�� ����");
			System.out.println("14�й� �ļҰ� �л��� �� ���� �ֱٿ� �¾"
					+ " �л��� �¾ ������?");
			a2 = sc.nextInt(); // 2�� �� �Է�
			System.out.println("����� �Է��� �� : " + a2); // 2�� ���� �Է��� ����� ���
			System.out.println();
			Outosolve os = new Outosolve(a1, a2); // �Է��� �ι����� ���� �ڵ� ���
			System.out.println("����� �Է��� �ΰ��� ���� ����� ��� : "
			+ os.getanswer()); // ��� ����� ���
			System.out.println("�н����带 �Է��Ͻʽÿ�.");
			long answer = sc.nextLong(); // ��� ���(�н�����)�� ���� �Է�
			if(answer == 2016026) // �н����带 ����� �Է��� ���
			{
				chance = 0; // �ݺ��� ���� ���� chance�� 0�� ����
				System.out.println("��𼱰� �֍֍� �Ҹ��� ���ϴ�.");
				System.out.println("������ ������ ���� 5�� �Է��Ͻʽÿ�.");
				while(true) // ���� �ݺ�
				{
					int a = sc.nextInt();
					if(a == 5)
					{
						Image i = new Image(a);
						return;
						// ����� �Է��Ͽ����� 5�� �̹����� ����ϰ� ����
					}
					else
						{
							System.out.println("5�� ����� �Է��Ͻʽÿ�!!!!");
							System.out.println("�ٽ� �Է��ϼ���!!");
							continue;
							// �ٽ� �Է��ϰ���
						}
				}
			}
			else // �н����尡 ����� �Է����� ���� ���
			{
				chance -= 1; // chance 1�� �����
				System.out.println("���� ��ȸ��"+chance+"�� ���ҽ��ϴ�."+
				" ó�� ���� �ٽ� Ǫ����!!"); // ���� ��ȸ ���
				if(chance == 0) // ��ȸ�� 0���� ���
				{
					System.out.println("��𼱰� �֍֍� �Ҹ��� ���ϴ�.");
					System.out.println("������ ������ ���� 5�� �Է��Ͻʽÿ�.");
					while(true) // ���� �ݺ�
					{
						int a = sc.nextInt();
						if(a == 5)
						{
							Image i = new Image(a);
							return;
							// ����� �Է��Ͽ����� 5�� �̹����� ����ϰ� ����
						}
						else
							{
								System.out.println("5�� ����� �Է��Ͻʽÿ�!!!!");
								System.out.println("�ٽ� �Է��ϼ���!!");
								continue;
								// �ٽ��Է��ϰ� ��
							}
					}
				}
				else
					continue;
				// chance�� 0�� �ƴ� ��� ó������ ����.
			}
		}
	}
}
class question2 extends Question{
	int a1, a2, a3; // ������ ������ ������ ���� ����
	private int chance = 3; // ��ȸ 3��
	void text(){
		Scanner sc = new Scanner(System.in);
		System.out.println("3���� ¥�� ��Ʈ�� ���̱���!");
		System.out.println("3������ Ǯ�� ������ ������ �ڵ� ���⿡ �Է�"
				+ "�Ǿ� ������ְ� �н����带 �����ݴϴ�.");
		while(true) // ���� �ݺ�
		{
			System.out.println("1�� ����");
			System.out.println("14�й� �ļҰ� �л����� �й��� �������� ���"
					+ "���� ����?");
			a1 = sc.nextInt(); // 1�� ���� �Է�
			System.out.println("����� �Է��� �� : " + a1); // 1�� ���� �Է��� ��� ���
			System.out.println();
			System.out.println("2�� ����");
			System.out.println("14�й� �ļҰ� �л��� �� ���� �ֱٿ� �¾"
					+ " �л��� �¾ ������?");
			a2 = sc.nextInt(); // 2�� ���� �Է�
			System.out.println("����� �Է��� �� : " + a2); // 2�� ���� �Է��� ��� ���
			System.out.println();
			System.out.println("3�� ����");
			System.out.println("�ϳ���, ���ɸ�ī�þ߽�, ����, �ݸ޴� ���⼭"
					+"����Ǵ� ���ڴ�?");
			a3 = sc.nextInt(); // 3�� ���� �Է�
			System.out.println("����� �Է��� �� : " + a3); // 3�� ���� �Է��� ��� ���
			System.out.println();
			Outosolve os = new Outosolve(a1, a2, a3);
			System.out.println("����� �Է��� ������ ���� ����� ��� : "
					+ os.getanswer()); // 3���� ���� �ڵ� ����� ���� ���
			System.out.println("�н����带 �Է��Ͻʽÿ�.");
			long answer = sc.nextLong(); // �н����� �Է�
			if(answer == 2016025)
			{
				System.out.println("���� ���� ���Ƚ��ϴ�!!!!");
				System.out.println("���� �� �ۿ� ���ڰ� ������ �ֽ��ϴ�."
						+" ����� ��й�ȣ�� 114");
				System.out.println("����� ��� ��ȣ�� �Է��Ͻÿ�.");
				break;
				// �ùٸ��� �Է��� ��� �ݺ� ����
			}
			else // �ùٸ��� �Է����� ���� ���
			{
				chance -= 1; // �� �� ���� chance�� 1�� ��
				System.out.println("���� ��ȸ��"+chance+"�� ���ҽ��ϴ�."+
						" ó�� ���� �ٽ� Ǫ����!!"); // ���� ��ȸ ���
					if(chance == 0) // chance�� 0�� �� 
					{
						System.out.println("��𼱰� �֍֍� �Ҹ��� ���ϴ�.");
						System.out.println("������ ������ ���� 5�� �Է��Ͻʽÿ�.");
						while(true)// ���� �ݺ�
						{
							int a = sc.nextInt();
							if(a == 5)
							{
								Image i = new Image(a);
								return;
								// ����� �Է��� ��� 5�� �̹����� ����ϰ� ����
							}
							else
								{
									System.out.println("5�� ����� �Է��Ͻʽÿ�!!!!");
									System.out.println("�ٽ� �Է��ϼ���!!");
									continue;
									// �ٽ� �Է��ϰ� ��
								}
						}
					}
				else
					continue;
					// chance�� 0�� �ƴҰ�� �ݺ�
			}
		}
	}
}