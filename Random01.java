import java.util.Random;
import java.util.Scanner;

public class Random01 {
	public static void main(String[] arg) {
		Scanner scnr = new Scanner(System.in);
		Random rndm = new Random();
		int n;
		
		n = scnr.nextInt();
		scnr.close();
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = rndm.nextInt(2);
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
		}
	}
}
