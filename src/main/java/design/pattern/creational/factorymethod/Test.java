package design.pattern.creational.factorymethod;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Test {
	public static void main(String[] args) {
		VideoFactory videoFactory = new JavaVideoFactory();
		Video video = videoFactory.getVideo();
		video.produce();

		videoFactory = new PythonVideoFactory();
		video = videoFactory.getVideo();
		video.produce();

		videoFactory = new FEVideoFactory();
		video = videoFactory.getVideo();
		video.produce();
	}
}
