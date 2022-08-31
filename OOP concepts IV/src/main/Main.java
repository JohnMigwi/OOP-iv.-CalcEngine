package main;

public class Main {

	public static void main(String[] args) {
		
	}
	   
		static void performCalculations() {
			MEquation[] equations=new MEquation[4];
			equations[0]=create(100.0d, 50.0d, 'd');
			equations[1]=create(25.9d, 92.0d, 'a');
			equations[2]=create(225.0d, 17.0d, 's');
			equations[3]=create(11.0d, 3.0d, 'm');
			
			for (MEquation equation : equations) {
				equation.execute();
				System.out.println("result = "+equation.result);
				
			}
				
	}

	private static MEquation create(double leftVal, double rightVal, char opCode) {
		MEquation equation=new MEquation();
		equation.leftVal =leftVal;
		equation.rightVal=rightVal;
		equation.opCode=opCode;
		return equation;
	}

}
