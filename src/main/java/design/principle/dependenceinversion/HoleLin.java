package design.principle.dependenceinversion;

/**
 * ClassName: HoleLin
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class HoleLin {
	private ICourse mICourse;


	public void setICourse(ICourse ICourse) {
		mICourse = ICourse;
	}

	public void studyCourse() {
		mICourse.studyCourse();
	}

}
