
public class AccountTest {
	public static void main(String[] arg) {
		Account acct1 = new Account(1122, 20000, 4.5);
		acct1.withdraw(2500);
		acct1.deposit(3000);
		
		System.out.println(acct1.getBalance() + "\n" + acct1.getMonthlyInterest() + "\n" + acct1.getDateCreated());
	}
}
