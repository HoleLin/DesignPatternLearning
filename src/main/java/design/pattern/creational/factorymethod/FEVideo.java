package design.pattern.creational.factorymethod;

/**
 * ClassName: FEVideo
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class FEVideo extends Video {
	@Override
	public void produce() {
		System.out.println("录制FE视频");
	}
}
