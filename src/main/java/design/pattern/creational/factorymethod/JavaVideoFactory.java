package design.pattern.creational.factorymethod;

/**
 * ClassName: JavaVideoFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class JavaVideoFactory extends VideoFactory {
	@Override
	public Video getVideo() {
		return new JavaVideo();
	}
}
