import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Image extends JFrame {
	private Container con; // 콘테이너 변수 선언
	private ImageIcon icon, main1, main2, main3, main4; // 이미지 객체 변수들 선언
	public Image(int choice){
		super("결과"); // 제목을 결과로 출력
		if(choice == 1) // 각각의 케이스 마다 다른 이미지 메소드를 호출
			this.input1();
		else if(choice == 2)
			this.input2();
		else if(choice == 3)
			this.input3();
		else if(choice == 4)
			this.input4();
		else if(choice == 5)
			this.input5();
		this.end(); // 종료 이벤트를 담당하는 메소드를 호출
		icon = new ImageIcon("icon.jpg");
		this.setIconImage(icon.getImage()); // 아이콘에 이미지 삽입
		this.setSize(350, 450); // 윈도우 창 사이즈 설정
		Toolkit tk = Toolkit.getDefaultToolkit(); // 툴킷 호출
		Dimension di1 = tk.getScreenSize();
		Dimension di2 = this.getSize();
		this.setLocation((int)(di1.getWidth() / 2 - di2.getWidth() / 2), 
				(int)(di1.getHeight() / 2 - di2.getHeight() / 2)); // 창을 화면 중앙에 위치하게 끔 한다.
		this.setVisible(true); // 창을 띄운다.
	}
	public void input1(){
		main1 = new ImageIcon("농구.jpg"); // 1번 케이스에 이미지 삽입
		con = this.getContentPane(); // 작업환경 불러옴
		con.add("Center", new JButton("실패",main1)); // 삽입한 이미지를 창 가운데에 위치 시킴
	}
	public void input2(){
		main2 = new ImageIcon("성공.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("성공",main2));
	}
	public void input3(){
		main3 = new ImageIcon("지갑.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("실패",main3));
	}
	public void input4(){
		main4 = new ImageIcon("차키.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("실패",main4));
	}
	public void input5(){
		main4 = new ImageIcon("자폭.jpg");
		con = this.getContentPane();
		con.add("Center", new JButton("실패",main4));
	}
	public void end(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 이벤트 발생
	}
}