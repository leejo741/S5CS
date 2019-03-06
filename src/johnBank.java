public class johnBank
{
	public static void main(String[] args){
		BankAccount c = new BankAccount(50.00);	//create a new BankAccount object

		//display balance of ba1
		System.out.println("Balance before transactions: "+ c.getBalance());


		c.deposit(74.35);							//make a deposit of $74.35
		c.withdraw(20.05);							//make a withdrawal of $20.05

		//display balance of ba1
		System.out.println("Balance after transactions: " + c.getBalance());
	} 												//end main
}
	class BankAccount{
		private double balance;							//account balance
		
		private static final double Overdraw_Penalty = 20.00;
		
		public BankAccount(double openingBalance)		//constructor
		{
			balance=openingBalance;
		}

		public void deposit(double amount)				//mutator: makes deposit
		{
			balance = balance+amount;
		}

		public void withdraw(double amount)				//mutator: makes withdrawal
		{
			balance = balance-amount;
			
			if (balance < 0)
			{
				balance = balance - Overdraw_Penalty;
			}
		}

		public double getBalance()						//accessor: displays balance
		{
			return(balance);
		}
	}													// end class BankAccount
