package design.pattern.structural.decorator.v1;

/**
 * ClassName: BatterCakeWithEggSausage
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
	@Override
	public String getDesc() {
		return super.getDesc() + " 加一根香肠";
	}

	@Override
	public int cost() {
		return super.cost() + 2;
	}
}
