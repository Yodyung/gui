package b_info2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView2 {
	
	//1. 멤버변수 선언
	JFrame f;	//새 창을 만들기 위한 선언
	JTextField tfname, tfId, tfTel, tfGender, tfAge, tfHome;
	//한 줄 입력 받을 때 사용
	JTextArea ta;
	//여러 줄 입력 받을 때 사용
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	//버튼 삽입
	JLabel la;
	//글씨만 한 줄 입력해야 할 때 사용
	
	//2. 멤버변수 객체생성
	InfoView2(){
		f=new JFrame("DBTest");		//새 창의 헤드부분에 나올 도메인
		tfname=new JTextField(10);	//한 줄 입력 받을 창 크기 선언
		tfId=new JTextField(10);
		tfTel=new JTextField(10);
		tfGender=new JTextField(10);
		tfAge=new JTextField(10);
		tfHome=new JTextField(10);
		ta=new JTextArea();			//여러 줄 입력 받을 창 
		bAdd=new JButton("Add");	//각 버튼들 
		bShow=new JButton("Show");
		bSearch=new JButton("Search");
		bDelete=new JButton("Delete");
		bCancel=new JButton("Cancel");
		bExit=new JButton("Exit");
	}
	
	//3. 화면 구성하고 출력
	/*
	 * 전체 프레임은 BorederLayout 지정 
	 * west : Jpannel 만들어서 Jlabel과 JTextField tfname, tfId, tfTel, tfGender, tfAge, tfHome; (GridLayout(6,2))
	 * center : JTextArea ta;
	 * south : Jpannel 만들어서 JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit; (GridLayout(1,6))
	 */
	public void addLayout() {
		//Border 레이아웃으로 큰 창의 전체 레이아웃 먼저 설정
		f.setLayout(new BorderLayout());
		//붙히기 작업
		//하단 버튼 붙히기
		JPanel jpdown=new JPanel();		//버튼 올릴 패널 만들기
		jpdown.setLayout(new GridLayout(1,6));	//패널을 행,열 순서대로 나오게 배치 출력
		jpdown.add(bAdd);	//패널 위에 버튼 올리기
		jpdown.add(bShow);
		jpdown.add(bSearch);
		jpdown.add(bDelete);
		jpdown.add(bCancel);
		jpdown.add(bExit);
		f.add(jpdown,BorderLayout.SOUTH);	//보더 레이아웃의 아래쪽에 위치 선언
		
		//왼쪽 붙히기
		JPanel jpwest=new JPanel();		//입력 창과 입력 받을 창 올릴 패널 만들기
		jpwest.setLayout(new GridLayout(6,2));	//패널을 행,열 순서대로 나오게 배치 출력
		jpwest.add(new JLabel("Name",JLabel.CENTER));	//가운데 정렬하는 키 JLabel뒤 .center넣기
		jpwest.add(tfname);
		jpwest.add(new JLabel("ID",JLabel.CENTER));
		jpwest.add(tfId);
		jpwest.add(new JLabel("Tel",JLabel.CENTER));
		jpwest.add(tfTel);
		jpwest.add(new JLabel("Sex",JLabel.CENTER));
		jpwest.add(tfGender);
		jpwest.add(new JLabel("Age",JLabel.CENTER));
		jpwest.add(tfAge);
		jpwest.add(new JLabel("Home",JLabel.CENTER));
		jpwest.add(tfHome);
		f.add(jpwest, BorderLayout.WEST);		//보더 레이아웃의 왼쪽에 위치 선언
		
		//오른쪽 붙히기
		f.add(ta,BorderLayout.CENTER);		//보더 레이아웃의 가운데쪽에 위치 선언
		
		f.setBounds(100,100,500,350);		//사이트의 크기 설정
		f.setVisible(true);					//true이기 때문에 프로그램이 보이게 작동함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x키를 누르면 프로그램 자동 종료
		
	}

	public static void main(String[] args) {
		
		InfoView2 info=new InfoView2();	//위의 페이지를 부를 변수 선언
		info.addLayout();				//레이아웃이 보이게 함수 선언

	}

}
