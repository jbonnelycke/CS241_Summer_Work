import java.util.*;
public class RandomTest {
	public static void main(String[] args) {
		Random generator = new Random(1000);
		
		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) + "\t" + generator.nextInt(100));
		}
	}
}
