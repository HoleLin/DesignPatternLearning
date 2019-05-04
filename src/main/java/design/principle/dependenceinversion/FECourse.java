package design.principle.dependenceinversion;

/**
 * ClassName: FECourse
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/3
 */

public class FECourse implements ICourse {
	public void studyCourse() {
		System.out.println("HoleLin在学习前端课程");

	}
}
