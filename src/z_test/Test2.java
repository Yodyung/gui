package z_test;
/*
 * 2> 객체지향 언어로서의 자바를 이용하여 프로그램을 작성한다.
    다음 요구사항을 만족하는 은행 계좌 클래스를 정의하여 소스코드를 작성하시고,
    결과화면 스크린 샷의 이미지 파일을 제출하시오

   [요구사항]
   가. 속성으로 예금주,계좌번호,잔액을 갖는다.
      예금주는 String,계좌번호 String,잔액은 int로 정의하여라

   나. 메소드로 인출 및 입금 메소드를 갖는다.
       인출 메소드는 인자로 인출할 금액을 받고 잔액이 부족시에는
       “잔액이 부족합니다”라는 메시지를 잔액이 충분할때는 인출한 금액을 출력하는 
       메소드이다
       입금 메소드는 인자로 입금할 금액을 받고 입금액을 잔액에 더하고
       입금한 금액을 출력하는 메소드이다

   다. toString()메소드를 오버라이딩하여 계좌정보 즉 예금주,계좌번호,잔액을
      출력하는 메소드를 정의하여라
      예 예금주:자바맨, 계좌번호:123-456, 잔액:1000원
 */
class Bank{
	String yeGumJu="예사랑";
	String number="123-456-789";
	int janAek;

	@Override
	public String toString() {
		return "Bank [예금주=" + yeGumJu + ", 계좌번호=" + number + ", 잔액=" + janAek + "원]";
	}

	public void deposit(int ipgm) {		//입금
		janAek=janAek+ipgm;
		System.out.println("입금하신 금액은 "+ipgm+"원 입니다. 잔액은 "+janAek+"원 입니다.");
	}

	public void withdrawal(int chulgm) {	//출금(인출)
		janAek=janAek-chulgm;
		if(janAek>=0) {
			System.out.println("출금하신 금액은 "+chulgm+"원 입니다. 잔액은 "+janAek+"원 입니다.");
		}else if(janAek<0) {
			janAek=janAek+chulgm;
			System.out.println("잔액이 부족합니다.");
		}
	} 

}
public class Test2 {
	public static void main(String[] args) {
		Bank b=new Bank();

		b.deposit(2000);
		b.deposit(6000);
		b.withdrawal(100);
		b.withdrawal(6400);

		System.out.println(b.toString());
	}

}
