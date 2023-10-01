package baitap.BaiTH;

public class bai6Account {
	private long accountNumver = 999999;
	private String name = "chưa xác định";
	private double balance = 50000;
	private final double RATE = 0.035;
	
	public bai6Account() {}
	
	public bai6Account(long accountNumver, String name) {
		this.accountNumver = accountNumver;
		this.name = name;
	}
	
	public bai6Account(long accountNumver, String name, double balance) {
		if (accountNumver > 0) {
			this.accountNumver = accountNumver;
		}
		if (name.length() > 0) {
			this.name = name;
		}
		
		this.balance = balance;
	}
	
	public long getAccountNumber () {
		return accountNumver;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance = balance + amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw(double amount, double fee) {
		if(amount > 0 && fee <= balance) {
			this.balance = balance - amount;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void addInterest() {
		this.balance = balance + balance*RATE;
	}
	
	public boolean transfer( bai6Account AC2, double amount  ) {
		this.balance = balance - amount;
		AC2.deposit(amount);
		return true;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "[accountNumber: " + accountNumver + ", name: " + name + ", balance: " + balance + ", RATE: "
				+ RATE + "] \n";
	}
	
	
	

	public static void main (String args[]) {
		bai6Account a1 = new bai6Account( 72354, "a",102.56);
		bai6Account a3 = new bai6Account(93757, "b", 759.32);
		bai6Account a2 = new bai6Account( 69713 ,"c",40.00);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		a1.deposit(25.85);
		a2.deposit(500.00);
		
		a2.withdraw(430.75, 1.50);
		a3.addInterest();
		
		System.out.println("\n");
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		a2.transfer(a1, 100.0);
		
		System.out.println("\n");
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		
		
		
	}
	
}
