package assignment2;

public class TestAccount {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("23445", 5000, 5);

		s1.deposit(15000);
		s1.withdraw(5000);
		s1.printAcctDetails();
		s1.addInterest();
		System.out.println(s1);

		System.out.println("===================================================================");
		HousingLoan h1 = new HousingLoan("128976", 4000, 50000, 3);
		h1.deposit(3345);
		h1.withdraw(1000);
		h1.printAcctDetails();
		h1.payEmi(500);
		h1.extendTenure(2);
		System.out.println(h1);

	}
}