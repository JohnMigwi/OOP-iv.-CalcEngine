package main;

public class MEquation {
	private double leftVal;
	private double rightVal;
	char opCode;
	private double result;
	
	private static int numberOfCalculations;
	private static int sumOfResults;
	
	
	
	
	public MEquation() {}
	
	public MEquation(char opCode) {
		this.opCode=opCode;
	}
	
	public MEquation(char opCode, double leftVal, double rightVal) {
		this(opCode);
		this.leftVal=leftVal;
		this.rightVal=rightVal;
	}
	
	
	//Accessors and mutators
	public double getLeftVal() {return leftVal;}
	public void setLeftVal(double leftVal) {this.leftVal=leftVal;}
	
	public double getReftVal() {return rightVal;}
	public void setRightVal(double rightVal) {this.rightVal=rightVal;}
	
	public double getResult() {return result;}
	public void setresult(double reuslt) {this.result=result;}
	
	
	
	
	
	
	
	
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
		
		numberOfCalculations++;
		sumOfResults +=result;
	}
	public void execute(double leftVal, double rightVal) {
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		
		execute();
	}
	
	public static double getAverageResult() {
		return sumOfResults/ numberOfCalculations;
	}
}
