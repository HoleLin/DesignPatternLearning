package design.pattern.behavioral.mediator;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class Test {
	public static void main(String[] args) {
		User lin = new User("lin");
		User hole = new User("hole");
		lin.sendMessage("Hello");
		hole.sendMessage("Hi");
	}
}
