package design.pattern.structural.decorator.v2;

/**
 * ClassName: AbstractDecorator
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public abstract class AbstractDecorator extends ABatterCake {
	private ABatterCake mABatterCake;

	public AbstractDecorator(ABatterCake ABatterCake) {
		mABatterCake = ABatterCake;
	}

	protected abstract void doSomething();

	@Override
	public String getDesc() {
		return mABatterCake.getDesc();
	}

	@Override
	public int cost() {
		return mABatterCake.cost();
	}
}
