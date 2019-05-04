package design.pattern.creational.factorymethod;

/**
 * ClassName: PythonVideoFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class PythonVideoFactory extends VideoFactory {
	@Override
	public Video getVideo() {
		return new PythonVideo();
	}
}
