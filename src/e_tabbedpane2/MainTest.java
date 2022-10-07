package e_tabbedpane2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		panelA=new PanelA();
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

	public static void main(String[] args) {
		
		MainTest test=new MainTest();
		test.addLayout();

	}

}
