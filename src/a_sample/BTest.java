package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame{		//부모 클래스에서 상속 받아와서 쓰기 때문에 내가 frame 자체가 되어버림. 부모 자식관에 상속을 받을 때는 반드시 하나만 상속받을 수 있음.
	
	JButton btn;
	
	BTest(){		//is a 방식
		super("나의 두번째 창");	//부모 클래스에서 super로 선언을 받아온다.
		btn=new JButton("click");	//상속받지 못하므로 다시 선언해준다.
	}

	void addLayout() {
		//붙히기
		add(btn);	//B테스트는 frame 자체이므로 f. 을 쓸 필요가 없다.
		//화면 출력
		setBounds(100,100,500,350);						
		setVisible(true);									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BTest b=new BTest();
		b.addLayout();

	}

}
