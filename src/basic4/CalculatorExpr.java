package basic4;

public class CalculatorExpr {
	private int num1, num2;
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	void getAddition() {
		System.out.println("num1+num2="+(num1+num2));
	}
	
	void getSubtraction() {
		System.out.println("num1-num2="+(num1-num2));
	}
	
	void getMultiplication() {
		System.out.println("num1Xnum2="+(num1*num2));
	}
	
	void getDivision() {
		System.out.println("num1/num2="+(double)(num1-num2));
		
	}

}
