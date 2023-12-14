package ch.schule.bank.junit5;

import ch.schule.Account;
import ch.schule.SalaryAccount;
import ch.schule.SavingsAccount;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse Account.
 *
 * @author xxxx
 * @version 1.0
 */
public class AccountTests {
    /**
     * Tested die Initialisierung eines Kontos.
     */
    @Test
    public void testInit() {
        Account account = new SalaryAccount("12345", 1000);
        assertEquals("12345", account.getId());
        assertEquals(0, account.getBalance());
    }

    /**
     * Testet das Einzahlen auf ein Konto.
     */
    @Test
    public void testDeposit() {
        Account account = new SalaryAccount("12345", 1000);
        assertTrue(account.deposit(20220101, 1000));
        assertEquals(1000, account.getBalance());
    }

    /**
     * Testet das Abheben von einem Konto.
     */
    @Test
    public void testWithdraw() {
        Account account = new SalaryAccount("12345", 1000);
        account.deposit(20220101, 2000);
        assertTrue(account.withdraw(20220102, 1000));
        assertEquals(1000, account.getBalance());
    }

    /**
     * Tests the reference from SavingsAccount
     */
    @Test
    public void testReferences() {
        SavingsAccount savingsAccount = new SavingsAccount("12345");
        savingsAccount.deposit(20220101, 1000);
        assertEquals(1000, savingsAccount.getBalance());
    }

    /**
     * teste the canTransact Flag
     */
    @Test
    public void testCanTransact() {
        Account account = new SalaryAccount("12345", 1000);
        account.deposit(20220101, 1000);
        assertTrue(account.canTransact(20220101));
        assertFalse(account.canTransact(20220100));
    }

    /**
     * Experimente mit print().
     */
    @Test
    public void testPrint() {
        Account account = new SalaryAccount("321", 1000);
        account.deposit(1, 100);
        account.withdraw(2, 50);
        account.print();
    }

    /**
     * Experimente mit print(year,month).
     */
    @Test
    public void testMonthlyPrint() {
        Account account = new SalaryAccount("654", 1000);
        account.deposit(1, 100);
        account.withdraw(31, 50);
        account.print(2023, 1);
    }

}
