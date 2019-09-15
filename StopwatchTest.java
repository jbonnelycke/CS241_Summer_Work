import java.util.*;

public class StopwatchTest {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] arr1 = new int[100000];
		Stopwatch sw = new Stopwatch();
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = generator.nextInt(1000) + 1;
		}
		
		sw.start();
		
		Sorts.selectionSort(arr1);
		
		sw.stop();
		System.out.println(sw.getStartTime());
		System.out.println(sw.getEndTime());
		System.out.println(sw.getElapsedTime());
	}
}
