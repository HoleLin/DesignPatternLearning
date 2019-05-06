package design.pattern.structural.decorator.v1;

/**
 * ClassName: BatterCakeWithEgg
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class BatterCakeWithEgg extends BatterCake {
	@Override
	public String getDesc() {
		return super.getDesc() + " 加个鸡蛋";
	}

	@Override
	public int cost() {
		return super.cost() + 1;
	}
}
