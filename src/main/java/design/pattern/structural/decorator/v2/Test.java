package design.pattern.structural.decorator.v2;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/6
 */

public class Test {
	public static void main(String[] args) {
		ABatterCake aBatterCake;
		aBatterCake = new BatterCake();
		aBatterCake = new EggDecorator(aBatterCake);
		aBatterCake = new EggDecorator(aBatterCake);
		aBatterCake = new SausageDecorator(aBatterCake);
		System.out.println(aBatterCake.getDesc() + " 价格:" + aBatterCake.cost());
	}
}
