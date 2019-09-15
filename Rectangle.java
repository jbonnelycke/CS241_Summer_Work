
public class Rectangle {
	public double width = 1;
	public double height = 1;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double myWidth, double myHeight) {
		width = myWidth;
		height = myHeight;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
}
