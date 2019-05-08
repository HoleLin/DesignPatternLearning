package design.pattern.structural.birdge;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Test {
	public static void main(String[] args) {
		Bank icbcBank = new ICBCBank(new DepositAccount());
		Account icbcAccount = icbcBank.openAccount();
		icbcAccount.showAccountType();


		Bank icbcBank2 = new ICBCBank(new SavingAccount());
		Account icbcAccount2 = icbcBank2.openAccount();
		icbcAccount2.showAccountType();

		Bank abcBank = new ABCBank(new SavingAccount());
		Account abcAcount = abcBank.openAccount();
		abcAcount.showAccountType();

	}
}
