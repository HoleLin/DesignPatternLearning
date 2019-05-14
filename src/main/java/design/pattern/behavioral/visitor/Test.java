package design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/14
 */

public class Test {
	public static void main(String[] args) {
		List<Course> coursesList = new ArrayList<>();
		FreeCourse freeCourse = new FreeCourse();
		freeCourse.setName("SpringMVC 数据绑定");
		CodingCourse codingCourse = new CodingCourse();
		codingCourse.setName("Java设计模式");
		codingCourse.setPrice(299);

		coursesList.add(freeCourse);
		coursesList.add(codingCourse);

		for (Course course : coursesList) {
			course.accept(new Visitor());
		}
	}
}
