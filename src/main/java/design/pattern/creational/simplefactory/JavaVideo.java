package design.pattern.creational.simplefactory;

/**
 * ClassName: JavaVideo
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class JavaVideo extends Video {
	@Override
	public void produce() {
		System.out.println("录制Java视频");
	}
}
