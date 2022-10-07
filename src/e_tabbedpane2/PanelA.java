package e_tabbedpane2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	JLabel aLa=new JLabel("판떼기 A");
	JButton aBt=new JButton("A버튼");

	public PanelA() {
		setBackground(new Color(255,150,150));	//RGB(red, green, blue)		Max=255;
		addLayout();
		eventProc();
	}
	
	void addLayout (){
		add(aLa);
		add(aBt);
		
	}
	void eventProc(){
		
	}
}
