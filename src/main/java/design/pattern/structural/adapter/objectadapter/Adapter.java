package design.pattern.structural.adapter.objectadapter;

/**
 * ClassName: Adapter
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class Adapter implements Target {
	private Adaptee mAdaptee = new Adaptee();
	@Override
	public void request() {
		mAdaptee.adapteeRequest();
	}
}
