package design.pattern.behavioral.command;

/**
 * ClassName: CloseCourseVideoCommand
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class CloseCourseVideoCommand implements Command {
	CourseVideo mCourseVideo;

	public CloseCourseVideoCommand(CourseVideo courseVideo) {
		mCourseVideo = courseVideo;
	}

	@Override
	public void execute() {
		mCourseVideo.close();
	}
}
