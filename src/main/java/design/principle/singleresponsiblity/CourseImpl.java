package design.principle.singleresponsiblity;

/**
 * ClassName: CourseImpl
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class CourseImpl implements ICourseContent,ICourseManager {
	@Override
	public String getCourseName() {
		return null;
	}

	@Override
	public byte[] getCourseVideo() {
		return new byte[0];
	}

	@Override
	public void studyCourse() {

	}

	@Override
	public void refundCourse() {

	}
}
