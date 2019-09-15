import java.util.Date;

public class CurrentDate {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		for (long i = 10000; i <=1e11; i*=10) {
			d1.setTime(i);
			System.out.println(d1);
		}
	}
}
