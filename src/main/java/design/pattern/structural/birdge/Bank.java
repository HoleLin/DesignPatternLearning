package design.pattern.structural.birdge;

/**
 * ClassName: Bank
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public abstract class Bank {
	protected Account mAccount;

	public Bank(Account account) {
		this.mAccount = account;
	}
	abstract Account openAccount();
}
