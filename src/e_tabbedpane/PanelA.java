package e_tabbedpane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{

	JLabel aLa=new JLabel("메인 홈페이지에 오신것을");
	JButton aBt=new JButton("A버튼");
	MainTest parent;

	public PanelA(MainTest mainTest) {
		parent=mainTest;
		//parent=new MainTest(); 				//A와 MainTest가 계속 무한루프
		setBackground(new Color(255,180,180));	//RGB(red, green, blue)		Max=255;
		addLayout();
		eventProc();
	}

	void addLayout (){
		add(aLa);
		add(aBt);

	}
	void eventProc(){
		aBt.addActionListener(new ActionListener(){				//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				parent.la.setText("안녕하세요!");
			}	
		});//bt.addActionListener END
		
				
	}
}
