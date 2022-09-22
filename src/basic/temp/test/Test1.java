package basic.temp.test;

import java.awt.Frame;

public class Test1 {

	Frame f;
	
	Test1(){
		f=new Frame("내 첫 페이지");
	}
	
	void addLayout() {
		f.setBounds(150, 150, 300, 260);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		t1.addLayout();

	}

}
