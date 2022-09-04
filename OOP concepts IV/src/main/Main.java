package main;

public class Main {

	public static void main(String[] args) {
		MEquation equation=new MEquation();
		
	}
	   
		
	
	
	static void performCalculations() {
			MEquation[] equations=new MEquation[4];
			equations[0]=new MEquation('d',100.0d, 50.0d);
			equations[1]=new MEquation('a',25.9d, 92.0d);
			equations[2]=new MEquation('s',225.0d, 17.0d);
			equations[3]=new MEquation('m',11.0d, 3.0d);
			
			for (MEquation equation : equations) {
				equation.execute();
				System.out.println("result = "+equation.getResult());
				
			}
			
			System.out.println("Average result = "+ MEquation.getAverageResult());
			
			System.out.println();
			System.out.println("Using execute overloads");
			System.out.println();
			
			MEquation equationOverload= new MEquation('d');
			
			double leftDouble=9.0d;
			double rightDouble=4.0d;
			equationOverload.execute(leftDouble, rightDouble);
			System.out.println("Overloaded redult with double:" +equationOverload.getResult());
		}

}
