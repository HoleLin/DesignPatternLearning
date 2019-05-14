package design.pattern.behavioral.state;

/**
 * ClassName: CourseVideoContext
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class CourseVideoContext {
	private CourseVidoeState mCourseVidoeState;
	public final static PlayState PLAY_STATE = new PlayState();
	public final static PauseState PAUSE_STATE = new PauseState();
	public final static SpeedState SPEED_STATE = new SpeedState();
	public final static StopState STOP_STATE = new StopState();

	public CourseVidoeState getCourseVidoeState() {
		return mCourseVidoeState;
	}

	public void setCourseVidoeState(CourseVidoeState courseVidoeState) {
		mCourseVidoeState = courseVidoeState;
		this.mCourseVidoeState.setCourseVideoContext(this);
	}

	public void play() {
		this.mCourseVidoeState.play();
	}

	public void pause() {
		this.mCourseVidoeState.pause();

	}

	public void speed() {
		this.mCourseVidoeState.speed();

	}

	public void stop() {
		this.mCourseVidoeState.stop();

	}
}
