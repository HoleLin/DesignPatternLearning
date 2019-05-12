package design.pattern.behavioral.command;

import design.pattern.behavioral.iterator.Course;

/**
 * ClassName: OpenCourseVideoCommand
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/12
 */

public class OpenCourseVideoCommand implements Command {
	CourseVideo mCourseVideo;

	public OpenCourseVideoCommand(CourseVideo courseVideo) {
		mCourseVideo = courseVideo;
	}


	@Override
	public void execute() {
		mCourseVideo.open();
	}
}
