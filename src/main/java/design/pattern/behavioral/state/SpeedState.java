package design.pattern.behavioral.state;

/**
 * ClassName: SpeedState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class SpeedState extends CourseVidoeState {
	@Override
	public void play() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.PLAY_STATE);

	}

	@Override
	public void speed() {
		System.out.println("课程视频正在加速");
	}

	@Override
	public void pause() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.PAUSE_STATE);

	}

	@Override
	public void stop() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.STOP_STATE);

	}
}
