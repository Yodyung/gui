package e_tabbedpane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class MainTest {
	
	JFrame f;
	JButton bt;
	JLabel la;
	PanelA panelA;
	PanelB panelB;
	PanelC panelC;
	
	public MainTest() {
		f=new JFrame("사랑이 창");
		bt=new JButton("체크");
		la=new JLabel("데이터");
		panelA=new PanelA(this);	//A의 주소값을 MainTest에서 받고 싶을 때 this로 받기
		panelB=new PanelB();
		panelC=new PanelC();
	}
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		f.add(bt, BorderLayout.EAST);		//프로그램의 기본 레이아웃이 보더레이아웃이라 선언해주지 않아도 사용 가능.
		f.add(la, BorderLayout.SOUTH);
		
		JTabbedPane tab=new JTabbedPane();
		tab.add("Main",panelA);
		tab.add("Sub",panelB);
		tab.add("ETC",panelC);
		f.add(tab,BorderLayout.CENTER);
		
		f.setBounds(100,100,500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void eventProc() {
		bt.addActionListener(new ActionListener(){				//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				panelA.aLa.setText("환영합니다.");
			}	
		});//bt.addActionListener END
		
	}//eventProc() END

	public static void main(String[] args) {
		
		MainTest test=new MainTest();
		test.addLayout();
		test.eventProc();
	}

}
