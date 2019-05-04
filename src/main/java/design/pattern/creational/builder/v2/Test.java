package design.pattern.creational.builder.v2;

/**
 * ClassName: Test
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/4
 */

public class Test {
	public static void main(String[] args) {
		Course course = new Course.CourseBuilder().
				buildCourseName("Java").
				buildCoursePPT("PPT").
				buildCourseVideo("Video").
				build();
		System.out.println("course = " + course);
	}
}
