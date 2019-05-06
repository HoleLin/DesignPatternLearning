package design.pattern.structural.decorator.v2;

/**
 * ClassName: BatterCake
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class BatterCake extends ABatterCake {
	@Override
	public String getDesc() {
		return "煎饼";
	}

	@Override
	public int cost() {
		return 8;
	}
}
