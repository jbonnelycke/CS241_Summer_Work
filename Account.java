import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	Account() {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	Account(int myID, double myBalance, double myInterestRate) {
		this.id = myID;
		this.balance = myBalance;
		annualInterestRate = myInterestRate;
		dateCreated = new Date();
	}
	
	int getID() {
		return this.id;
	}
	
	void setID(int newID) {
		this.id = newID;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	Date getDateCreated() {
		return this.dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	
	double getMonthlyInterest() {
		return (balance * (annualInterestRate / 100)) / 12;
	}
	
	void withdraw(double amtWithdrawn) {
		balance -= amtWithdrawn;
	}
	
	void deposit(double amtDeposited) {
		balance += amtDeposited;
	}
}	
