package Demo;

public class ImplictTypePromotion {

	public static void main(String[] args) {
		// two different type of variable
		short s= 1024;
		double d = .1234;
		
		double result= d*s;
		// console window for result
		System.out.println("result is = " + result);
	}

	}

