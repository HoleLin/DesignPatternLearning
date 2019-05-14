package design.pattern.behavioral.state;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class Test {
	public static void main(String[] args) {
		CourseVideoContext courseVideoContext = new CourseVideoContext();
		courseVideoContext.setCourseVidoeState(new PlayState());

		System.out.println("当前的状态:" + courseVideoContext.getCourseVidoeState().getClass().getSimpleName());
		courseVideoContext.pause();

		System.out.println("当前的状态:" + courseVideoContext.getCourseVidoeState().getClass().getSimpleName());
		courseVideoContext.speed();

		System.out.println("当前的状态:" + courseVideoContext.getCourseVidoeState().getClass().getSimpleName());
		courseVideoContext.stop();
		System.out.println("当前的状态:" + courseVideoContext.getCourseVidoeState().getClass().getSimpleName());

	}
}
