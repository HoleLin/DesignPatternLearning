package design.pattern.behavioral.command;

/**
 * ClassName: CourseVideo
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class CourseVideo {
	private String name;

	public CourseVideo(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println(this.name+"视频课程开放");
	}

	public void close() {
		System.out.println(this.name+"视频课程关闭");
	}
}
