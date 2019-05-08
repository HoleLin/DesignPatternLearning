package design.pattern.structural.adapter.classadapter;

/**
 * ClassName: ConcreteTarget
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("ConcreteTarget目标方法");
	}
}
