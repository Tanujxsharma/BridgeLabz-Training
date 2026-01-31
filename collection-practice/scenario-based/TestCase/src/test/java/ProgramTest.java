import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {

    @Test
    public void Test_Deposit_ValidAmount() throws Exception {
        Program p = new Program(200.0);

        p.deposit(200.0);

        double balance = p.balance;
        assertEquals(400.0,balance);
    }
    @Test
    public void Test_Deposit_NegativeAmount(){
        Program p = new Program(200.0);
        try {
            p.deposit(-200.0);
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void Test_Withdraw_ValidAmount() throws Exception{
        Program p = new Program(200.0);
        p.withdraw(150.0);
        double balance = p.balance;
        assertEquals(50.0,balance);
    }
    @Test
    public void Test_Withdraw_InsufficientFunds(){
        Program p = new Program(200);
        try{
            p.withdraw(500.0);
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

}
