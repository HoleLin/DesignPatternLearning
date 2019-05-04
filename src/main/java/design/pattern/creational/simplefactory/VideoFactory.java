package design.pattern.creational.simplefactory;

/**
 * ClassName: VideoFactory
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class VideoFactory {
	public Video getVideo(String type) {
		switch (type) {
			case "Java":
				return new JavaVideo();
			case "Python":
				return new PythonVideo();
			default:
				return null;
		}
	}
	public Video getVideo(Class clazz) {
		Video video = null;
		try {
			video = (Video) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return video;
	}
}
