package design.pattern.creational.factorymethod;

/**
 * ClassName: FEVideoFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class FEVideoFactory extends VideoFactory {
	@Override
	public Video getVideo() {
		return new FEVideo();
	}
}
