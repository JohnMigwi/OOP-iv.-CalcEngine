package main;

public class MEquation {
	double leftVal;
	double rightVal;
	char opCode;
	double result;
	
	public MEquation() {}
	
	
	public MEquation(char opCode) {
		this.opCode=opCode;
	}
	
	public MEquation(char opCode, double leftVal, double rightVal) {
		this(opCode);
		this.leftVal=leftVal;
		this.rightVal=rightVal;
	}
	
	
	
	void execute() {
		switch (opCode) {
		case 'a':
			result= leftVal  + rightVal;
			break;
		case 's':
			result= leftVal  - rightVal;
			break;
		case 'm':
			result= leftVal  * rightVal;
			break;
		case 'd':
			result=rightVal!=0 ? leftVal  / rightVal: 0.0d;
			break;

		default:
			System.out.println("Invalid opCode" +opCode);
			result=0.0d;
			break;
		}
	}
	
}
