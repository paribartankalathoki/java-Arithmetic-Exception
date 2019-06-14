/**
 * @author Paribartan
 *
 */
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		int e = a-b;
		System.out.println("e: " + e);
		
		try {
			int c = a/b;
			System.out.println("c: "+ c);
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
			
		}
		int d = a + b;
		System.out.println("d: " + d);
		
		

	}

}
