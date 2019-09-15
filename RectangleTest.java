
public class RectangleTest {
	public static void main(String args[]) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(4, 40);
		Rectangle rect3 = new Rectangle(3.5, 35.9);
		
		System.out.println(rect1.height);
		System.out.println(rect1.width);
		System.out.println(rect1.getArea());
		System.out.println(rect1.getPerimeter());
		
		System.out.println("");
		
		System.out.println(rect2.height);
		System.out.println(rect2.width);
		System.out.println(rect2.getArea());
		System.out.println(rect2.getPerimeter());
		
		System.out.println("");
		
		System.out.println(rect3.height);
		System.out.println(rect3.width);
		System.out.println(rect3.getArea());
		System.out.println(rect3.getPerimeter());
	}
}
