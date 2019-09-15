import java.util.Scanner;

public class Reverse {
	public static void main(String[] arg) {
		Scanner scnr = new Scanner(System.in);
		int i = scnr.nextInt();
		scnr.close();
		
		reverseDisplay(i);
	}
	
	public static void reverseDisplay(int value) {
		if (value < 10)
			System.out.println(value);
		else {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}
}
