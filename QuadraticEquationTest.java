import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a, b, then c.");
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		scnr.close();
		
		QuadraticEquation variables = new QuadraticEquation(a, b, c);
		
		System.out.println(variables.getDiscriminant());
		
		if (variables.getDiscriminant() > 0)
			System.out.println("The two roots are:" + variables.getRoot1() + ", " + variables.getRoot2());
		else if (variables.getDiscriminant() == 0) 
			System.out.println("The one root is: " + variables.getRoot1());
		else
			System.out.println("The equation has no roots");
	}
}
