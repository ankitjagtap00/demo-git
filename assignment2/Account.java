package assignment2;
public class Account {
		protected String accNo;
		protected double balance;
		public Account(String accNo, double balance) {
			super();
			this.accNo = accNo;
			this.balance = balance;
		}
		public void deposit(double amt) {
			balance = balance + amt;
			System.out.println("new bal is" + balance);
		}
		public void withdraw(double amt) {
			balance = balance - amt;
			System.out.println("new bal is" + balance);
		}
		public void printAcctDetails() {
			System.out.println("account no is " + accNo);
			System.out.println("balance is " + balance);
		}
	}
	class SavingAccount extends Account {
		private double interestRate;
		public SavingAccount(String accNo, double balance, double interestRate) {
			super(accNo, balance);
			this.interestRate = interestRate;
		}
		public void addInterest() {
			System.out.println("interestRate=  " + interestRate);
		}
		@Override
		public String toString() {
			return "SavingAccount [interestRate=" + interestRate + ", accNo=" + accNo + ", balance=" + balance + "]";
		}
	}
