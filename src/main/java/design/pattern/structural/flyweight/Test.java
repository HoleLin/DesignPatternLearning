package design.pattern.structural.flyweight;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Test {
	private static final String[] DEPARTMENTS = {"ED", "QA", "PM", "BD"};

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String department = DEPARTMENTS[(int)( Math.random() * DEPARTMENTS.length)];
			Manager manager = (Manager) EmployeeFactory.getManager(department);
			manager.report();
		}
	}
}
