import java.util.GregorianCalendar;
public class CalendarTest {
	public static void main(String[] args) {
		
		GregorianCalendar greg = new GregorianCalendar();
		
		System.out.println("The current year, month, and day are: ");
		System.out.print(greg.get(GregorianCalendar.YEAR) + ", ");
		System.out.print(greg.get(GregorianCalendar.MONTH) + ", ");
		System.out.print(greg.get(GregorianCalendar.DAY_OF_MONTH));
		
		System.out.println();
		
		greg.setTimeInMillis(1234567898765L);
		
		System.out.println("The specified year, month, and day are: ");
		System.out.print(greg.get(GregorianCalendar.YEAR) + ", ");
		System.out.print(greg.get(GregorianCalendar.MONTH) + ", ");
		System.out.print(greg.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
