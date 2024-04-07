package assignment2;
	class LoanAccount extends Account {
		protected double loanamt;
		public LoanAccount(String accNo, double balance, double loanamt) {

			super(accNo, balance);
			this.loanamt = loanamt;
		}
		public void payEmi(double emi) {
			System.out.println("EMI paid successfully");
			loanamt = loanamt - emi;

		}
	}