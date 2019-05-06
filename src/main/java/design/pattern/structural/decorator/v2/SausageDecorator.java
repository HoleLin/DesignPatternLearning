package design.pattern.structural.decorator.v2;

/**
 * ClassName: SausageDecorator
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class SausageDecorator extends AbstractDecorator {
	public SausageDecorator(ABatterCake ABatterCake) {
		super(ABatterCake);
	}

	@Override
	protected void doSomething() {

	}

	@Override
	public String getDesc() {
		return super.getDesc() + " 加一个香肠";
	}

	@Override
	public int cost() {
		return super.cost() + 2;
	}
}
