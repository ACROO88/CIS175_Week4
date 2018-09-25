package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import model.BankAccount;
import model.BankAccountLogic;

public class TestBankAccountLogic {
	BankAccountLogic logic = new BankAccountLogic();
	BankAccount acct = new BankAccount("Alex", "Rooney", 1800);
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testDeposit() {
		double balance = acct.getBalance();
		balance = logic.deposit(200, acct);
		assertEquals(2000, balance, 0.0);
	}
	
	@Test
	public void testWithdraw() {
		double balance = acct.getBalance();
		balance = logic.withdraw(200,  acct);
		assertEquals(1600, balance, 0.0);
	}
	
	@Test
	public void testDisplayFullName() {
		String fullName = logic.displayFullName(acct);
		assertEquals("Alex Rooney", fullName, "Alex Rooney");
	}

}
