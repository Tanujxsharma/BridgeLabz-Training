public class Program extends BankException {
    Double balance ;
    Program(double initialBalance){
        super("Amount cannot be negative ");
        this.balance=initialBalance;
    }
    public void deposit(double depositAmount)throws BankException{
        if(depositAmount>=0.0){
            balance+=depositAmount;
        }
        else{
            throw new BankException("Deposit amount cannot be negative");
        }
    }
    public void withdraw(double withdrawAmount)throws BankException{
        if(withdrawAmount<=balance){
            balance-=withdrawAmount;
        }
        else{
            throw new BankException("Insufficient funds ");
        }
    }
}
