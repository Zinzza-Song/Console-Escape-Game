public class Outosolve{
	private int total; // ����� ������ ���� ����(�ٸ� ������ ���� ���ϰ� ����)
	Outosolve(int a1, int a2){ // ������ �����ε�
		answer1(a1, a2);
	}
	private void answer1(int a1,int  a2){ // �޼ҵ� �����ε�
		total = a1 + a2; // 2���� ����ϴ� ��� ��� ����
	}
	Outosolve(int a1, int a2, int a3){
		answer2(a1, a2, a3);
	}
	private void answer2(int a1, int a2, int a3){
		total = a1 + a2 - a3; // 3���� ����ϴ� ��� ��� ����
	}
	public int getanswer(){
		return total;
	}
}