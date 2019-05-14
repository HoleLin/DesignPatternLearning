package design.pattern.behavioral.state;

/**
 * ClassName: CourseVidoeState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public abstract class CourseVidoeState {
	protected CourseVideoContext mCourseVideoContext;

	public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
		mCourseVideoContext = courseVideoContext;
	}

	public abstract void play();

	public abstract void speed();

	public abstract void pause();

	public abstract void stop();
}
