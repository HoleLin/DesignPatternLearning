package design.pattern.behavioral.state;

/**
 * ClassName: PauseState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class PauseState extends CourseVidoeState {
	@Override
	public void play() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.PLAY_STATE);

	}

	@Override
	public void speed() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.SPEED_STATE);

	}

	@Override
	public void pause() {
		System.out.println("课程视频已暂停");
	}

	@Override
	public void stop() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.STOP_STATE);

	}
}
