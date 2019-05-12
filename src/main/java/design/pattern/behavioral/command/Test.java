package design.pattern.behavioral.command;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class Test {
	public static void main(String[] args) {
		CourseVideo courseVideo = new CourseVideo("设计模式");
		OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
		CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
		Staff staff = new Staff();
		staff.addCommand(openCourseVideoCommand);
		staff.addCommand(closeCourseVideoCommand);
		staff.executeCommands();
	}
}
