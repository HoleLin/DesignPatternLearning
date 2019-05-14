package design.pattern.behavioral.state;

/**
 * ClassName: PlayState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class PlayState extends CourseVidoeState {
	@Override
	public void play() {
		System.out.println("正常播放课程视频状态");
	}

	@Override
	public void speed() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.SPEED_STATE);
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
