package design.pattern.creational.simplefactory;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Test {
	public static void main(String[] args) {
		System.out.println("============一般=============");
		VideoFactory videoFactory = new VideoFactory();
		Video video = videoFactory.getVideo("Java");
		if (video == null) {
			return;
		}
		video.produce();
		System.out.println("============反射=============");
				// 使用反射获取对象
				Video videoByRefect = videoFactory.getVideo(JavaVideo.class);
		if (videoByRefect == null) {
		return;
		}
		videoByRefect.produce();
		}
		}
