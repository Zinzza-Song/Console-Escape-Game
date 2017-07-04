import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Image extends JFrame {
	private Container con; // �����̳� ���� ����
	private ImageIcon icon, main1, main2, main3, main4; // �̹��� ��ü ������ ����
	public Image(int choice){
		super("���"); // ������ ����� ���
		if(choice == 1) // ������ ���̽� ���� �ٸ� �̹��� �޼ҵ带 ȣ��
			this.input1();
		else if(choice == 2)
			this.input2();
		else if(choice == 3)
			this.input3();
		else if(choice == 4)
			this.input4();
		else if(choice == 5)
			this.input5();
		this.end(); // ���� �̺�Ʈ�� ����ϴ� �޼ҵ带 ȣ��
		icon = new ImageIcon("icon.jpg");
		this.setIconImage(icon.getImage()); // �����ܿ� �̹��� ����
		this.setSize(350, 450); // ������ â ������ ����
		Toolkit tk = Toolkit.getDefaultToolkit(); // ��Ŷ ȣ��
		Dimension di1 = tk.getScreenSize();
		Dimension di2 = this.getSize();
		this.setLocation((int)(di1.getWidth() / 2 - di2.getWidth() / 2), 
				(int)(di1.getHeight() / 2 - di2.getHeight() / 2)); // â�� ȭ�� �߾ӿ� ��ġ�ϰ� �� �Ѵ�.
		this.setVisible(true); // â�� ����.
	}
	public void input1(){
		main1 = new ImageIcon("��.jpg"); // 1�� ���̽��� �̹��� ����
		con = this.getContentPane(); // �۾�ȯ�� �ҷ���
		con.add("Center", new JButton("����",main1)); // ������ �̹����� â ����� ��ġ ��Ŵ
	}
	public void input2(){
		main2 = new ImageIcon("����.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("����",main2));
	}
	public void input3(){
		main3 = new ImageIcon("����.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("����",main3));
	}
	public void input4(){
		main4 = new ImageIcon("��Ű.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("����",main4));
	}
	public void input5(){
		main4 = new ImageIcon("����.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("����",main4));
	}
	public void end(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� �̺�Ʈ �߻�
	}
}