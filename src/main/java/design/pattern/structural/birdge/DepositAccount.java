package design.pattern.structural.birdge;

/**
 * ClassName: DepositAccount
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class DepositAccount implements Account {
	@Override
	public Account openAccount() {
		System.out.println("打开定期账号");
		return new DepositAccount();
	}

	@Override
	public void showAccountType() {
		System.out.println("这个一个定期账号");
	}
}
