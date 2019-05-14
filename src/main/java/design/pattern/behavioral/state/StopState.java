package design.pattern.behavioral.state;

/**
 * ClassName: StopState
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class StopState extends CourseVidoeState {
	@Override
	public void play() {
		super.mCourseVideoContext.setCourseVidoeState(CourseVideoContext.PLAY_STATE);

	}

	@Override
	public void speed() {
		System.out.println("ERROR 停止状态不能快进!!");
	}

	@Override
	public void pause() {
		System.out.println("ERROR 停止状态不能暂停!!");

	}

	@Override
	public void stop() {
		System.out.println("课程视频停止播放");
	}
}
