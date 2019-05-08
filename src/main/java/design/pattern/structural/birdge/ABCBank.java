package design.pattern.structural.birdge;

/**
 * ClassName: ABCBank
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class ABCBank extends Bank {

	public ABCBank(Account account) {
		super(account);
	}

	@Override
	Account openAccount() {
		System.out.println("打开中国农业银行账号");
		mAccount.openAccount();
		return mAccount;
	}
}
