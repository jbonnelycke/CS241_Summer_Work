
public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = 1;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	Fan() {
	}
	
	String getSpeed() {
		String s = "";
		switch (speed) {
		case SLOW: s = "SLOW";
		break;
		case MEDIUM: s = "MEDIUM";
		break;
		case FAST: s = "FAST";
		}
		return s;
	}
	
	void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	boolean getOn() {
		return on;
	}
	
	void setOn(boolean newStatus) {
		on = newStatus;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	public String toString() {
		if (this.getOn() == true) {
			return this.getSpeed() + " " + this.getColor() + " " + this.getRadius();
		}
		else {
			return "fan is off";
		}
			
	}
}
