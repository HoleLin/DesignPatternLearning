package design.pattern.structural.birdge;

/**
 * ClassName: ICBCBank
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class ICBCBank extends Bank {

	public ICBCBank(Account account) {
		super(account);
	}

	@Override
	Account openAccount() {
		System.out.println("打开中国工商银行账号");
		mAccount.openAccount();
		return mAccount;
	}
}
