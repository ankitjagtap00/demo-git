package assignment2;
	public class HousingLoan extends LoanAccount {
		int tenure;
		public HousingLoan(String accNo, double balance, double loanamt, int tenure) {
			super(accNo, balance, loanamt);
			this.tenure = tenure;
		}
		public void extendTenure(int yr) {
			tenure = tenure + yr;
			System.out.println("tenure extend successfully by" + yr + " years");
		}
		@Override
		public String toString() {
			return "HousingLoan [tenure=" + tenure + ", loanamt=" + loanamt + ", accNo=" + accNo + ", balance=" + balance
					+ "]";
		}
}
