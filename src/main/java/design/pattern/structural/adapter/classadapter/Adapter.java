package design.pattern.structural.adapter.classadapter;

/**
 * ClassName: Adapter
 * 类设配器
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.adapteeRequest();
	}
}
