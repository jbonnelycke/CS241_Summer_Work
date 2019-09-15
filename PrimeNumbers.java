import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		final int NUM = 120;
		Scanner scnr = new Scanner(System.in);
		boolean isPrime = true;
		int n;
		int temp;
		n = scnr.nextInt();
		for (int i = 2; i <= n/2; i++) {
			temp = n % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime);
	}
}
