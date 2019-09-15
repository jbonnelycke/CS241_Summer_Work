
public class Circle {
	private int radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(int newRadius) {
		radius = newRadius;
	}
	
	public void setRadius(int newRadius) {
		radius = newRadius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (this.radius * this.radius) * Math.PI;
	}
}
