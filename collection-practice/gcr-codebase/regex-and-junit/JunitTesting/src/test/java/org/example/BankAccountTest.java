package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("ACC123", 1000.0);
    }


    @Test
    void testDepositIncreasesBalance() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    void testMultipleDeposits() {
        account.deposit(200.0);
        account.deposit(300.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    void testDepositZeroThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(0.0)
        );
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testDepositNegativeThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-100.0)
        );
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }
    @Test
    void testWithdrawDecreasesBalance() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawExactBalance() {
        account.withdraw(1000.0);
        assertEquals(0.0, account.getBalance(), 0.01);
    }

    @Test
    void testInsufficientFundsThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(1500.0)
        );
        assertTrue(exception.getMessage().contains("Insufficient funds"));
        assertEquals(1000.0, account.getBalance(), 0.01); // Balance unchanged
    }

    @Test
    void testWithdrawZeroThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(0.0)
        );
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(-50.0)
        );
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    @Test
    void testDepositThenWithdraw() {
        account.deposit(500.0);
        account.withdraw(200.0);
        assertEquals(1300.0, account.getBalance(), 0.01);
    }

    @Test
    void testInitialBalance() {
        assertEquals(1000.0, account.getBalance(), 0.01);
    }

    @Test
    void testInitialZeroBalance() {
        BankAccount zeroAccount = new BankAccount("ACC999", 0.0);
        assertEquals(0.0, zeroAccount.getBalance(), 0.01);
    }

    @Test
    void testInitialNegativeBalanceThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("ACC999", -100.0));
    }
}
