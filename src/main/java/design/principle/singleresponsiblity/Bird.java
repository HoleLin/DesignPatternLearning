package design.principle.singleresponsiblity;

/**
 * ClassName: Bird
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Bird {
	public void mainMoveMode(String birdName) {
		if ("鸵鸟".equals(birdName)) {
			System.out.println(birdName + "用脚走");

		} else {
			System.out.println(birdName + "用翅膀飞");
		}
	}
}
