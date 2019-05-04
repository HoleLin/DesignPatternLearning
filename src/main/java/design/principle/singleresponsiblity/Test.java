package design.principle.singleresponsiblity;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Test {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.mainMoveMode("大雁");
		FlyBird flyBird = new FlyBird();
		flyBird.mainMoveMode("大雁");
		WalkBird walkBird = new WalkBird();
		walkBird.mainMoveMode("鸵鸟");
	}
}
