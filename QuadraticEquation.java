
public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	
	public QuadraticEquation(int newa, int newb, int newc) {
		a = newa;
		b = newb;
		c = newc;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return ((b * b) - (4 * a * c));
	}
	
	public double getRoot1() {
		if (this.getDiscriminant() >= 0)
			return ((-b) + Math.sqrt(this.getDiscriminant())) / (2 * a);
		else
			return 0;
	}
	
	public double getRoot2() {
		if	(this.getDiscriminant() >= 0)
			return ((-b) - Math.sqrt(this.getDiscriminant())) / (2 * a);
		else
			return 0;
	}
}
