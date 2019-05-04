package design.pattern.creational.builder;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Test {
	public static void main(String[] args) {
		CourseBuilder courseBuilder = new CourseActualBuilder();
		Coach coach = new Coach();
		coach.setCourseBuilder(courseBuilder);
		Course course = coach.makeCourse("Java设计模式",
				"PPT",
				"Java视频",
				"Java手记",
				"Java问答");
		System.out.println("course = " + course);

	}
}
