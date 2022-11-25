package calculator;

public class Calculator {
	private int result;
	
	public int getResult() {
		return result;
	}//getter메소드
	
	public Calculator(int num1, int num2, String operator) {
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}//switch
	}//Calculator()
}//class
