package design.principle.singleresponsiblity;

/**
 * ClassName: Method
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Method {
	private void updateUserInfo(String userName, String address) {

	}

	private void updateUserInfo(String userName, String... properties) {

	}

	// 改进 符合单一责任原则
	private void updateUserName(String userName) {

	}

	private void updateUserAddress(String address) {

	}
}
