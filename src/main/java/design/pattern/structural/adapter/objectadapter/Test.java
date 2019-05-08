package design.pattern.structural.adapter.objectadapter;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Test {
	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		target.request();
		Target adapterTarget = new Adapter();
		adapterTarget.request();
	}

}
