package customclasses;

public class MathHelper {
	
	int i;
	int j;
	int x;
	
	public int add() {
		return i+j;
	}
	
	public int substraction(int x, int y) {
		return x-y;	
	}
	public double divide(double x, double y) {
		return x/y;	
	}
	public int multiply(int x, int y) {
		return x*y;	
	}
	
	public static void main(String[] args) {
		
		MathHelper helper=new MathHelper();
		helper.i=10;
		helper.j=20;
		
		int addResult=helper.add();
		System.out.println("the result is "+addResult);
		
		int subResult=helper.substraction(44, 10);
		System.out.println("the result of substraction is "+subResult);
		
		double divResult=helper.divide(100, 42);
		System.out.println("the result of divide is "+divResult);
		
		int mulResult=helper.multiply(100, 8);
		System.out.println("the result of multiply is "+mulResult);
			
	}

	
}

