package main;

public class Main {

	public static void main(String[] args) {
		MEquation equation=new MEquation();
		equation.execute();
	}
	   
		
	
	
	static void performCalculations() {
			MEquation[] equations=new MEquation[4];
			equations[0]=new MEquation('d',100.0d, 50.0d);
			equations[1]=new MEquation('a',25.9d, 92.0d);
			equations[2]=new MEquation('s',225.0d, 17.0d);
			equations[3]=new MEquation('m',11.0d, 3.0d);
			
			for (MEquation equation : equations) {
				equation.execute();
				System.out.println("result = "+equation.result);
				
			}
		}

}
