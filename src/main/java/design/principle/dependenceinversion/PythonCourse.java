package design.principle.dependenceinversion;

/**
 * ClassName: PythonCourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class PythonCourse implements ICourse {
	public void studyCourse() {
		System.out.println("HoleLin在学习Python课程");
	}
}
