import java.util.Scanner;
public class GCD {
	public static void main(String[] arg) {
		Scanner scnr = new Scanner(System.in);
		int m1 = scnr.nextInt();
		int n1 = scnr.nextInt();
		
		System.out.println(gcd(m1, n1));
	}
	
	public static int gcd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return gcd(n, m %n);
	}
}
