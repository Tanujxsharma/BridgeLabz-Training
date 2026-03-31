public class BankAccountSystem {
	// declaring the variables 
	private static String bankName = "Lota Bank";
	private static int totalAccount = 0;
	private final String accountNumber ;
	private String accountHolderName;
	private double balance;
	// constructor of the class 
	public BankAccountSystem (String accountNumber,String accountHolderName,double balance ) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance=balance;
		totalAccount++;
	}
	// get total account function 
	public static void getTotalAccount(int totalAccount){
		System.out.println("Total Accounts are "+totalAccount);
	}
	 public void displayAccountDetails() {
	       // Using instanceof to check if the object is a BankAccount instance
	       if (this instanceof BankAccountSystem) {
	           System.out.println("Bank Name " + bankName);
	           System.out.println("Account Holder " + accountHolderName);
	           System.out.println("Account Number " + accountNumber);
	           System.out.println("Balance " + balance);
	       } else {
	           System.out.println(" Invalid account instance.");
	       }
	   }
	 // getter setter methods 
	  public String getAccountHolderName() {
	       return accountHolderName;
	   }

	 public void setAccountHolderNumer(String name ) {
		 accountHolderName = name;
	 }
	 public double getBalance() {
	       return balance;
	   }
	 public void deposit (double ammount) {
		 if(ammount>0) {
		 balance = balance + ammount;
		 System.out.println("The new total ammount is "+balance);
		 }
		 else {
			 System.out.print("enter valid ammount ");
		 }
	 }
	 public void withdraw(double ammount ) {
		 if(ammount >0 && ammount <=balance ) {
			 balance-=ammount ;
			 System.out.println("the remaning  balance is" + balance );
		 }
		 else {
			 System.out.println("insuffcient balance or invalid ammount ");
		 }
	 }

	public static void main(String[] args) {
		

	}

}