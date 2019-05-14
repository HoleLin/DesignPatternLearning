package design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * ClassName: User
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		StudyGroup.showMessage(this, message);
	}
}
