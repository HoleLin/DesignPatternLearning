package design.pattern.structural.decorator.v2;

/**
 * ClassName: EggDecorator
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class EggDecorator extends AbstractDecorator {
	public EggDecorator(ABatterCake ABatterCake) {
		super(ABatterCake);
	}

	@Override
	protected void doSomething() {

	}

	@Override
	public String getDesc() {
		return super.getDesc()+" 加一个鸡蛋";
	}

	@Override
	public int cost() {
		return super.cost()+1;
	}
}
