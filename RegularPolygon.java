
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon(){
	}
	
	RegularPolygon(int sides, double length) {
		n = sides;
		side = length;
	}
	
	RegularPolygon(int sides, double length, double xcoor, double ycoor) {
		n = sides;
		side = length;
		x = xcoor;
		y = ycoor;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int newN) {
		n = newN;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double newSide) {
		side = newSide;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double newX) {
		x = newX;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double newY) {
		y = newY;
	}
	
	public double getPerimeter() {
		return (n * side);
	}
	
	public double getArea() {
		return (n * (side * side)) / (4 * Math.tan(Math.PI/ n));
	}
}
