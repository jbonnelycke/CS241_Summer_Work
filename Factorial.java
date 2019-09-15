import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] arg) {
		Scanner scnr = new Scanner(System.in);
		String i = scnr.nextLine();
		scnr.close();
		BigInteger big = new BigInteger(i);
		System.out.println(factorial(big));
		
		Integer i1 = 12;
		double i2 = 12.0;
		i2 = (int) 13.0;
		System.out.println(i2);
		
	}
	
	public static BigInteger factorial(BigInteger number) {
		if (number.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
	}
}
